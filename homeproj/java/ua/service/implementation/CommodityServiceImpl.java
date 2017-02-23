package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Commodity;
import ua.repository.CommodityRepository;
import ua.service.CommodityService;

@Service
public class CommodityServiceImpl implements CommodityService{

	@Autowired
	private CommodityRepository commodityRepository;

	@Override
	public Commodity findOne(int id) {
		
		return commodityRepository.findOne(id);
	}

	@Override
	public List<Commodity> findAll() {
		
		return commodityRepository.findAll();
	}

	@Override
	public void save(Commodity commodity) {
		commodityRepository.save(commodity);
		
	}

	@Override
	public void delete(int id) {
		commodityRepository.delete(id);
	}
	
	
	
}
