package ua.service;

import java.util.List;

import ua.entity.Commodity;

public interface CommodityService{

	Commodity findOne(int id);
	
	List<Commodity> findAll();
	
	void save(Commodity commodity);
	
	void delete(int id);
	
}
