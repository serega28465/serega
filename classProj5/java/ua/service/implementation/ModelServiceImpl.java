package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.dto.filter.BasicFilter;
import ua.entity.Model;
import ua.entity.Size;
import ua.repository.ModelRepository;
import ua.service.ModelService;
import ua.service.specification.ModelSpecification;
import ua.service.specification.SizeSpecification;

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
		// TODO Auto-generated method stub
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

	@Override
	public Page<Model> findAll(BasicFilter filter, Pageable pageable) {
		// TODO Auto-generated method stub
		return modelRepository.findAll(new ModelSpecification(filter), pageable);
	}
	
	
}