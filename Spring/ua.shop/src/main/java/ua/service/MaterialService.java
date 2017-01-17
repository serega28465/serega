package ua.service;

import java.util.List;

import ua.entity.Country;
import ua.entity.Material;

public interface MaterialService {

	Material findOne(int id);
	
	List<Material> findAll();
	
	void save(Material material);
	
	void delete(int id);
	
}
