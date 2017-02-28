package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Commodity;
import ua.entity.Country;

public interface CountryService {

	Country findOne(int id);
	
	List<Country> findAll();
	
	void save(Country country);
	
	void delete(int id);

	Country findByCountry(String country);
	
	Page<Country> findAll(BasicFilter filter, Pageable pageable);
}
