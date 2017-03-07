package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Material;
import ua.entity.Mechanika;

public interface MechanikaService {

	Mechanika findOne(int id);
	
	List<Mechanika> findAll();
	
	void save(Mechanika mechanika);
	
	void delete(int id);

	Mechanika findByMechanika(String mechanika);
	
	Page<Mechanika> findAll(BasicFilter filter, Pageable pageable);
}
