package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.dto.filter.BasicFilter;
import ua.entity.Producer;
import ua.repository.ProducerRepository;
import ua.service.ProducerService;
import ua.service.specification.ColorSpecification;
import ua.service.specification.ProducerSpecification;

@Service
public class ProducerServiceImpl implements ProducerService{

	@Autowired
	private ProducerRepository producerRepository;

	@Override
	public Producer findOne(int id) {
		// TODO Auto-generated method stub
		return producerRepository.findOne(id);
	}

	@Override
	public List<Producer> findAll() {
		// TODO Auto-generated method stub
		return producerRepository.findAll();
	}

	@Override
	public void save(Producer producer) {
		// TODO Auto-generated method stub
		producerRepository.save(producer);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		producerRepository.delete(id);
	}
	
	@Override
	public Producer findByName(String name) {
		// TODO Auto-generated method stub
		return producerRepository.findByName(name);
	}

	@Override
	public Page<Producer> findAll(BasicFilter filter, Pageable pageable) {
		// TODO Auto-generated method stub
		return producerRepository.findAll(new ProducerSpecification(filter), pageable);
	}
	
}
