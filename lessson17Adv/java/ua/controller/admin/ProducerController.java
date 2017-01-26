package ua.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.editor.ProducerEditor;
import ua.entity.Country;
import ua.entity.Producer;
import ua.service.CountryService;
import ua.service.ProducerService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/admin/producer")
@SessionAttributes(names="producer")
public class ProducerController {

	@Autowired
	private ProducerService producerService;
	
	
	@InitBinder("producer")
	protected void initBinder(WebDataBinder binder){
	   binder.registerCustomEditor(Producer.class, new ProducerEditor(producerService));
	}
	
	@ModelAttribute("producer")
	public Producer getForm(){
		return new Producer();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("producers", producerService.findAll());
		return "admin-producer";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("producer", producerService.findOne(id));
		model.addAttribute("specStrings", producerService.findAll());
		return "admin-producer";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		producerService.delete(id);
		return "redirect:/admin/producer";
	}
	
	@RequestMapping(method=POST)
	public String save(@ModelAttribute("producer") Producer form, SessionStatus status){
		producerService.save(form);
		status.setComplete();
		return "redirect:/admin/producer";
	}
}