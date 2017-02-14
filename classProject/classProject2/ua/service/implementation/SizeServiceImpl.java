package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Size;
import ua.repository.SizeRepository;
import ua.service.SizeService;

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
	
	
}
