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
import ua.service.CategoryService;
import ua.validator.CategoryValidator;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

	@Autowired
	
	private CategoryService categoryService;
	
	@InitBinder("category")
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new CategoryValidator(categoryService));
	}
	
	@ModelAttribute("category")
	public Category getForm(){
		return new Category();
	}
	
	@ModelAttribute("filter")
	public BasicFilter getFilter(){
		return new BasicFilter();
	}
	
	
	@RequestMapping
	public String show(SessionStatus status, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		model.addAttribute("page", categoryService.findAll(filter, pageable));
		status.setComplete();
		return "admin-category";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		categoryService.delete(id);
		return "redirect:/admin/category"+getParams(pageable, filter);
	}
	


	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		model.addAttribute("category",categoryService.findOne(id));
		model.addAttribute("page", categoryService.findAll(filter, pageable));
		return "admin-category";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("category") @Valid Category category,BindingResult br, SessionStatus status,Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		if(br.hasErrors()){
			model.addAttribute("page", categoryService.findAll(filter, pageable));
			return "admin-category";
		}
		categoryService.save(category);
		status.setComplete();
		return "redirect:/admin/category"+getParams(pageable, filter);
	}
}