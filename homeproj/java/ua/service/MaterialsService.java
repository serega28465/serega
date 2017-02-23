package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Material;
import ua.entity.Materials;

public interface MaterialsService {

	Materials findOne(int id);
	
	List<Materials> findAll();
	
	void save(Materials materials);
	
	void delete(int id);

	

}
