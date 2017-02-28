package ua.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ua.dto.filter.BasicFilter;
import ua.dto.filter.CommodityFilter;
import ua.dto.form.CommodityForm;
import ua.entity.Color;
import ua.entity.Commodity;

public interface CommodityService{

	Commodity findOne(int id);
	
	List<Commodity> findAll();
	
	void save(CommodityForm commodity);
	
	void delete(int id);
	
	Commodity findByCommodity(String commodity);
	

	Page<Commodity> findAll(BasicFilter filter, Pageable pageable);
}
