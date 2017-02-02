package ua.controller.admin;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import ua.entity.Category;
import ua.service.CategoryService;
import ua.validator.CategoryValidator;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

	@Autowired
	
	private CategoryService categoryService;
	
	@InitBinder("category")
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new CategoryValidator(categoryService));
	}
	
	@ModelAttribute("category")
	public Category getForm(){
		return new Category();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("categories", categoryService.findAll());
		return "admin-category";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		categoryService.delete(id);
		return "redirect:/admin/category";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("category",categoryService.findOne(id));
		model.addAttribute("categories", categoryService.findAll());
		return "admin-category";
	}
	
	//вказуємо що це метод POST (статичний імпорт)
	@RequestMapping(method=POST)
	//вказуємо що в параметрах буде параметр name
	public String save(@ModelAttribute("category") @Valid Category category,BindingResult br, SessionStatus status,Model model){
		if(br.hasErrors()){
			model.addAttribute("categories", categoryService.findAll());
			return "admin-category";
		}
		categoryService.save(category);
		status.setComplete();
		return "redirect:/admin/category";
	}
}