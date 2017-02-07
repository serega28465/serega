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
import ua.entity.Mechanika;
import ua.service.ColorService;
import ua.service.MechanikaService;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
@RequestMapping("/admin/mechanika")
@SessionAttributes(names="mechanika")
public class MechanikaController {

	@Autowired
	private MechanikaService mechanikaService;
	
	@ModelAttribute("mechanika")
	public Mechanika getForm(){
		return new Mechanika();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("mechanikas", mechanikaService.findAll());
		return "admin-mechanika";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		mechanikaService.delete(id);
		return "redirect:/admin/mechanika";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("mechanika", mechanikaService.findOne(id));
		model.addAttribute("mechanikas", mechanikaService.findAll());
		return "admin-mechanika";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("mechanika") Mechanika form, SessionStatus status){
		mechanikaService.save(form);
		status.setComplete();
		return "redirect:/admin/mechanika";
	}
}
	


