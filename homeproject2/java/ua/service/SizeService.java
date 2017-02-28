package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Producer;
import ua.entity.Size;

public interface SizeService {

	Size findOne(int id);
	
	List<Size> findAll();
	
	void save(Size size);
	
	void delete(int id);

	Size findBySize(String size);

	Page<Size> findAll(BasicFilter filter, Pageable pageable);
	
}
