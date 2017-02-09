package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ua.entity.Model;
import ua.repository.ModelRepository;
import ua.service.ModelService;

@Service
public class ModelServiceImpl implements ModelService{

	@Autowired
	private ModelRepository modelRepository;

	@Override
	public Model findOne(int id) {
		return modelRepository.findOne(id);
	}

	@Override
	public List<Model> findAll() {
		
		return modelRepository.findAll();
	}

	@Override
	public void save(Model model) {
		modelRepository.save(model);
		
	}

	@Override
	public void delete(int id) {
		modelRepository.delete(id);
		
	}

	@Override
	public Model findByModel(String model) {
		
		return modelRepository.findByModel(model);
	}

	
	
}
