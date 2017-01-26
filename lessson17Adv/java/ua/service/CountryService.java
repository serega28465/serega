package ua.service;

import java.util.List;

import ua.entity.Commodity;
import ua.entity.Country;

public interface CountryService {

	Country findOne(int id);
	
	List<Country> findAll();
	
	void save(Country country);
	
	void delete(int id);
}
