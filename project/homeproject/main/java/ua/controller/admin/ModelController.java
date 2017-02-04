package ua.controller.admin;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

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


import ua.service.ModelService;
import ua.validator.ModelValidator;

@Controller
@RequestMapping("/admin/model")
@SessionAttributes(names="model")
public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	
	@InitBinder("model")
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new ModelValidator(modelService));
	}
	
	@ModelAttribute("model")
	public ua.entity.Model getForm(){
		return new ua.entity.Model();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("models", modelService.findAll());
		return "admin-model";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		modelService.delete(id);
		return "redirect:/admin/model";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("model", modelService.findOne(id));
		model.addAttribute("models", modelService.findAll());
		return "admin-model";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("model") @Valid ua.entity.Model form, BindingResult br, SessionStatus status, Model model){
		if(br.hasErrors()){
			model.addAttribute("models", modelService.findAll());
			return "admin-model";
		}
		modelService.save(form);
		status.setComplete();
		return "redirect:/admin/model";
	}
	

}