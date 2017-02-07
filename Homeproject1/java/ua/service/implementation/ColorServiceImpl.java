package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Category;
import ua.entity.Color;
import ua.repository.ColorRepository;
import ua.service.ColorService;

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

	
		
	}

