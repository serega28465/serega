package ua.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.entity.Color;
import ua.service.ColorService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
@RequestMapping("/admin/color")
@SessionAttributes(names="color")
public class ColorController {

	@Autowired
	private ColorService colorService;
	
	@ModelAttribute("color")
	public Color getForm(){
		return new Color();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("colors", colorService.findAll());
		return "admin-color";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		colorService.delete(id);
		return "redirect:/admin/color";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("color", colorService.findOne(id));
		model.addAttribute("colors", colorService.findAll());
		return "admin-color";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("color") Color form, SessionStatus status){
		colorService.save(form);
		status.setComplete();
		return "redirect:/admin/color";
	}
}
	

