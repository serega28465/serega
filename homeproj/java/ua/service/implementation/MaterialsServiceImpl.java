package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Material;
import ua.entity.Materials;
import ua.repository.MaterialRepository;
import ua.repository.MaterialsRepository;
import ua.service.MaterialsService;
import ua.service.specification.CategorySpecification;


@Service
public class MaterialsServiceImpl implements MaterialsService{

	@Autowired
	private MaterialsRepository materialsRepository;

	@Autowired
	private MaterialRepository materialRepository;
	
	@Override
	public Materials findOne(int id) {
		
		return materialsRepository.findOne(id);
	}

	@Override
	public List<Materials> findAll() {
		
		return materialsRepository.findAll();
	}

	@Override
	public void save(Materials materials) {
		materialsRepository.save(materials);
		
	}

	@Override
	public void delete(int id) {
		materialsRepository.delete(id);
		
	}
	
//	@Override
//	public Page<Materials> findAll(BasicFilter filter, Pageable pageable) {
//		// TODO Auto-generated method stub
//		return materialsRepository.findAll(new MaterialsSpecification(filter), pageable);
//	}

	
	
}
