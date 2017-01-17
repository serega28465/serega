package ua.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.entity.Material;
import ua.repository.MaterialRepository;
import ua.service.MaterialService;

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
	
	
}
