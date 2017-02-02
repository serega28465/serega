package ua.service;

import java.util.List;

import ua.entity.Category;
import ua.entity.Mechanika;
import ua.entity.Model;

public interface ModelService {

	Model findOne(int id);
	
	List<Model> findAll();
	
	void save(Model model);
	
	void delete(int id);
	
	Model findByModel(String model);
}
