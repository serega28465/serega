package ua.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.entity.Producer;
import ua.service.CountryService;
import ua.service.ProducerService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/admin/producer")
public class ProducerController {

	@Autowired
	private ProducerService producerService;
	@Autowired
	private CountryService countryService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("producer", producerService.findAll());
		model.addAttribute("country", countryService.findAll());
		return "admin-producer";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		producerService.delete(id);
		return "redirect:/admin/producer";
	}
	
	@RequestMapping(method=POST)
	public String save(@RequestParam String name, @RequestParam int producerId){
		Producer producer = new Producer();
		producer.setName(name);
		producerService.save(producer);
		return "redirect:/admin/producer";
	}
}