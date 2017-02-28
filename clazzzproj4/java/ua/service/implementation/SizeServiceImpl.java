package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.dto.filter.BasicFilter;
import ua.entity.Size;
import ua.repository.SizeRepository;
import ua.service.SizeService;
import ua.service.specification.CategorySpecification;
import ua.service.specification.SizeSpecification;

@Service
public class SizeServiceImpl implements SizeService{

	@Autowired
	private SizeRepository sizeRepository;

	@Override
	public Size findOne(int id) {
		
		return sizeRepository.findOne(id);
	}

	@Override
	public List<Size> findAll() {
		// TODO Auto-generated method stub
		return sizeRepository.findAll();
	}

	@Override
	public void save(Size size) {
		sizeRepository.save(size);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sizeRepository.delete(id);
	}

	@Override
	public Size findBySize(String size) {
		// TODO Auto-generated method stub
		return sizeRepository.findBySize(size);
	}

	@Override
	public Page<Size> findAll(BasicFilter filter, Pageable pageable) {
		// TODO Auto-generated method stub
		return sizeRepository.findAll(new SizeSpecification(filter), pageable);
	}
	
	
}
