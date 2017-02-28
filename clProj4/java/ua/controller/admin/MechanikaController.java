package ua.controller.admin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Color;
import ua.entity.Mechanika;
import ua.service.ColorService;
import ua.service.MechanikaService;
import ua.validator.CategoryValidator;
import ua.validator.MechanikaValidator;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static ua.service.utils.ParamBuilder.getParams;
@Controller
@RequestMapping("/admin/mechanika")
@SessionAttributes(names="mechanika")
public class MechanikaController {

	@Autowired
	private MechanikaService mechanikaService;
	
	@InitBinder("mechanika")
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new MechanikaValidator(mechanikaService));
	}
	
	
	@ModelAttribute("mechanika")
	public Mechanika getForm(){
		return new Mechanika();
	}
	
	@ModelAttribute("filter")
	public BasicFilter getFilter(){
		return new BasicFilter();
	}
	
	@RequestMapping
	public String show(SessionStatus status, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		model.addAttribute("page", mechanikaService.findAll(filter, pageable));
		status.setComplete();
		return "admin-mechanika";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		mechanikaService.delete(id);
		return "redirect:/admin/mechanika"+getParams(pageable, filter);
	}
	


	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		model.addAttribute("mechnika",mechanikaService.findOne(id));
		model.addAttribute("page", mechanikaService.findAll(filter, pageable));
		return "admin-mechanika";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("mechanika") @Valid Mechanika mechanika,BindingResult br, SessionStatus status,Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		if(br.hasErrors()){
			model.addAttribute("page", mechanikaService.findAll(filter, pageable));
			return "admin-mechanika";
		}
		mechanikaService.save(mechanika);
		status.setComplete();
		return "redirect:/admin/mechanika"+getParams(pageable, filter);
	}
}