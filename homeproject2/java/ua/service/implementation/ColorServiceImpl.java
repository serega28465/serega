package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Color;
import ua.repository.ColorRepository;
import ua.service.ColorService;
import ua.service.specification.CategorySpecification;
import ua.service.specification.ColorSpecification;

@Service
public class ColorServiceImpl implements ColorService{

	@Autowired
	private ColorRepository colorRepository;

	@Override
	public Color findOne(int id) {
		
		return colorRepository.findOne(id);
	}

	@Override
	public List<Color> findAll() {
		
		return colorRepository.findAll();
	}

	@Override
	public void save(Color color) {
		colorRepository.save(color);
		
	}

	@Override
	public void delete(int id) {
		colorRepository.delete(id);
		
	}

	@Override
	public Color findByColor(String color) {
	
		return colorRepository.findByColor(color);
	}

	@Override
	public Page<Color> findAll(BasicFilter filter, Pageable pageable) {
		// TODO Auto-generated method stub
		return colorRepository.findAll(new ColorSpecification(filter), pageable);
	}
	
		
	}

