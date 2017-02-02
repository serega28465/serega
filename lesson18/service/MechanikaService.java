package ua.service;

import java.util.List;

import ua.entity.Material;
import ua.entity.Mechanika;

public interface MechanikaService {

	Mechanika findOne(int id);
	
	List<Mechanika> findAll();
	
	void save(Mechanika mechanika);
	
	void delete(int id);
	
}
