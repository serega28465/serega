package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Materials;
import ua.repository.MaterialsRepository;
import ua.service.MaterialsService;

@Service
public class MaterialsServiceImpl implements MaterialsService{

	@Autowired
	private MaterialsRepository materialsRepository;

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
	
	
}
