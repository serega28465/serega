package ua.controller.admin;

import static ua.service.utils.ParamBuilder.getParams;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.dto.filter.BasicFilter;
import ua.service.ModelService;
import ua.validator.ModelValidator;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


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
	@ModelAttribute("filter")
	public BasicFilter getFilter(){
		return new BasicFilter();
	}
	
	@RequestMapping
	public String show(SessionStatus status, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		model.addAttribute("page", modelService.findAll(filter, pageable));
		status.setComplete();
		return "admin-model";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		modelService.delete(id);
		return "redirect:/admin/model"+getParams(pageable, filter);
	}
	


	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		model.addAttribute("model",modelService.findOne(id));
		model.addAttribute("page", modelService.findAll(filter, pageable));
		return "admin-model";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("model") @Valid ua.entity.Model modele,BindingResult br, SessionStatus status, Model model, @PageableDefault Pageable pageable, @ModelAttribute("filter") BasicFilter filter){
		if(br.hasErrors()){
			model.addAttribute("page", modelService.findAll(filter, pageable));
			return "admin-model";
		}
		modelService.save(modele);
		status.setComplete();
		return "redirect:/admin/model"+getParams(pageable, filter);
	}
}