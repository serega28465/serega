package ua.controller.admin;

import static ua.service.utils.ParamBuilder.getParams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Material;
import ua.service.CategoryService;
import ua.service.MaterialService;
import ua.validator.CategoryValidator;
import ua.validator.MaterialValidator;

@Controller
@RequestMapping("/admin/material")
public class MaterialController {

	@Autowired
	
	private MaterialService materialService;
	
	@InitBinder("material")
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new MaterialValidator(materialService));
	}
	
	@ModelAttribute("material")
	public Material getForm(){
		return new Material();
	}
	
	@ModelAttribute("filter")
	public BasicFilter getFilter(){
		return new BasicFilter();
	}
	
	
	@RequestMapping
	public String show(SessionStatus status, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		model.addAttribute("page", materialService.findAll(filter, pageable));
		status.setComplete();
		return "admin-material";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		materialService.delete(id);
		return "redirect:/admin/material"+getParams(pageable, filter);
	}
	


	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		model.addAttribute("material",materialService.findOne(id));
		model.addAttribute("page", materialService.findAll(filter, pageable));
		return "admin-material";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("material") @Valid Material material,BindingResult br, SessionStatus status,Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		if(br.hasErrors()){
			model.addAttribute("page", materialService.findAll(filter, pageable));
			return "admin-material";
		}
		materialService.save(material);
		status.setComplete();
		return "redirect:/admin/material"+getParams(pageable, filter);
	}
}