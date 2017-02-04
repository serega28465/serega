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
import ua.entity.Material;
import ua.entity.Materials;
import ua.service.ColorService;
import ua.service.MaterialService;
import ua.service.MaterialsService;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
@RequestMapping("/admin/materials")
@SessionAttributes(names="materials")
public class MaterialsController {

	@Autowired
	private MaterialsService materialsService;
	
	@Autowired
	private MaterialService materialService;
	
	@ModelAttribute("materials")
	public Materials getForm(){//!!!!!!!!!!!!!!!!!
		return new Materials();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("verhs", materialsService.findAll());
		model.addAttribute("nizs", materialsService.findAll());
		model.addAttribute("obechaikas", materialsService.findAll());
		model.addAttribute("grifs", materialsService.findAll());
		return "admin-materials";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		materialsService.delete(id);
		return "redirect:/admin/materials";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("verh", materialsService.findOne(id));
		model.addAttribute("niz", materialsService.findOne(id));
		model.addAttribute("obechaika", materialsService.findOne(id));
		model.addAttribute("grif", materialsService.findOne(id));
		model.addAttribute("verhs", materialService.findAll());
		model.addAttribute("nizs", materialService.findAll());
		model.addAttribute("obechaikas", materialService.findAll());
		model.addAttribute("grifs", materialService.findAll());
		return "admin-materials";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("materials") Materials form, SessionStatus status){
		materialsService.save(form);
		status.setComplete();
		return "redirect:/admin/materials";
	}
}
	

