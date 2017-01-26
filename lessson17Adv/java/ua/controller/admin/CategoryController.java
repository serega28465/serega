package ua.controller.admin;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import ua.entity.Category;
import ua.service.CategoryService;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {

	@Autowired
	
	private CategoryService categoryService;
	
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
	//������� �� �� ����� POST (��������� ������)
	@RequestMapping(method=POST)
	//������� �� � ���������� ���� �������� name
	public String save(@RequestParam String name){
		//�������� � ����� ��� ����������
		//��'���� Category
		Category category = new Category();
		category.setCategory(name);
		categoryService.save(category);
		//���� ���� ������ � ������� ������� 
		//������� ������ �������, ��� ��������
		//�������� �������� �����
		//���� �������� �� ��������� ������ �������
		return "redirect:/admin/category";
	}
}