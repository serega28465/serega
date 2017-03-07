package ua.service.implementation;

import java.math.BigDecimal;
import java.util.List;

import javax.mail.Folder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dto.filter.BasicFilter;
import ua.dto.filter.CommodityFilter;
import ua.dto.form.CommodityForm;
import ua.entity.Commodity;
import ua.repository.CommodityRepository;
import ua.service.CommodityService;
import ua.service.FileWriter;
import ua.service.specification.CategorySpecification;
import ua.service.specification.CommoditySpecification;

@Service
public class CommodityServiceImpl implements CommodityService{

	@Autowired
	private CommodityRepository commodityRepository;

	@Autowired
	private FileWriter fileWriter;
	
	@Override
	public Commodity findOne(int id) {
		
		return commodityRepository.findOne(id);
	}

	@Override
	public List<Commodity> findAll() {
		
		return commodityRepository.findAll();
	}
	

	
	
	@Override
	public void delete(int id) {
		commodityRepository.delete(id);
	}

	

	// @Override
	// public Page<Commodity> findAll(BasicFilter filter, Pageable pageable) {
	// // TODO Auto-generated method stub
	// return commodityRepository.findAll(new CommoditySpecification(filter),
	// pageable);
	// }

	@Override
	@Transactional
	public void save(CommodityForm commodityForm) {
		Commodity commodity = new Commodity();
		commodity.setId(commodityForm.getId());
		commodity.setCategory(commodityForm.getCategory());
		commodity.setProducer(commodityForm.getProducer());
		commodity.setPrice(commodityForm.getPrice());
		commodity.setModel(commodityForm.getModel());
		commodity.setColor(commodityForm.getColor());
		commodity.setCountry(commodityForm.getCountry());

		commodity.setSize(commodityForm.getSize());
		commodity = commodityRepository.saveAndFlush(commodity);
		
		if (fileWriter.write(ua.service.FileWriter.Folder.ITEM, commodityForm.getFile(), commodity.getId())) {
			if (commodity.getVersion() == null)
				commodity.setVersion(0);
			else
				commodity.setVersion(commodity.getVersion() + 1);
		}
		commodityRepository.save(commodity);
	}


	@Override
	public Page<Commodity> findAll(CommodityFilter filter, Pageable pageable) {
		System.out.println("---------------------------------------------------------------");
		Page<Commodity> commoditys = commodityRepository.findAll(new CommoditySpecification(filter),pageable);
		System.out.println("---------------------------------------------------------------");
		return commoditys;
	}

	
}
