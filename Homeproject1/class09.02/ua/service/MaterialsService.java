package ua.service;

import java.util.List;

import ua.entity.Material;
import ua.entity.Materials;

public interface MaterialsService {

	Materials findOne(int id);
	
	List<Materials> findAll();
	
	void save(Materials materials);
	
	void delete(int id);


	Materials findByMaterials(Material material, Material material2, Material material3, Material material4);
}
