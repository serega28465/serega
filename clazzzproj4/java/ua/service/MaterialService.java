package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.dto.filter.BasicFilter;

import ua.entity.Material;

public interface MaterialService {

	Material findOne(int id);
	
	List<Material> findAll();
	
	void save(Material material);
	
	void delete(int id);

	Material findByMaterial(String material);
	
	Page<Material> findAll(BasicFilter filter, Pageable pageable);
}
