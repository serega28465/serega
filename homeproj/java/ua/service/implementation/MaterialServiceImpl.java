package ua.service.implementation;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.dto.filter.BasicFilter;

import ua.entity.Material;
import ua.repository.MaterialRepository;
import ua.service.MaterialService;
import ua.service.specification.CategorySpecification;
import ua.service.specification.MaterialSpecification;

@Service
public class MaterialServiceImpl implements MaterialService{

	private MaterialRepository materialRepository;

	@Override
	public Material findOne(int id) {
		
		return materialRepository.findOne(id);
	}

	@Override
	public List<Material> findAll() {
		// TODO Auto-generated method stub
		return materialRepository.findAll();
	}

	@Override
	public void save(Material material) {
		materialRepository.save(material);
		
	}

	@Override
	public void delete(int id) {
		materialRepository.delete(id);
		
	}
	
	@Override
	public Material findByMaterial(String material) {
	
		return materialRepository.findByMaterial(material);
	}

	@Override
	public Page<Material> findAll(BasicFilter filter, Pageable pageable) {
		// TODO Auto-generated method stub
		return materialRepository.findAll(new MaterialSpecification(filter), pageable);
	}
	
}
