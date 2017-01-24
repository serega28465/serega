package ua.controller.admin;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.service.implementation.*;
import ua.entity.Country;
import ua.service.CountryService;



@Controller
@RequestMapping("/admin/country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("countrys", countryService.findAll());
		return "admin-country";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		countryService.delete(id);
		return "redirect:/admin/country";
	}
	
	@RequestMapping(method=POST)
	public String save(@RequestParam String name, @RequestParam int countryId){
		Country country = new Country();
		country.setCountry(name);
		countryService.save(country);
		return "redirect:/admin/country";
	}
}