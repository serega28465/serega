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
import ua.entity.Size;
import ua.service.ColorService;
import ua.service.SizeService;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
@RequestMapping("/admin/size")
@SessionAttributes(names="size")
public class SizeController {

	@Autowired
	private SizeService sizeService;
	
	@ModelAttribute("size")
	public Size getForm(){
		return new Size();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("sizes", sizeService.findAll());
		return "admin-size";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		sizeService.delete(id);
		return "redirect:/admin/size";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("size", sizeService.findOne(id));
		model.addAttribute("sizes", sizeService.findAll());
		return "admin-size";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("size") Size form, SessionStatus status){
		sizeService.save(form);
		status.setComplete();
		return "redirect:/admin/size";
	}
}
	
