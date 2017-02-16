package ua.service;

import java.util.List;

import ua.entity.Material;
import ua.entity.Materials;

public interface MaterialsService {

	Materials findOne(int id);
	
	List<Materials> findAll();
	
	void save(Materials materials);
	
	void delete(int id);



//	Materials findByMaterials(Material material, Material material2, Material material3, Material material4);
////
//	Materials findByMaterials(List<Materials> verhs, List<Materials> nizs,List<Materials> obechaikas, List<Materials> grifs);

	Materials findByMaterials(Material material, Material material2, Material material3, Material material4);

	Materials findByMaterials(Materials verh, Materials niz, Materials obechaika, Materials grif);
}
