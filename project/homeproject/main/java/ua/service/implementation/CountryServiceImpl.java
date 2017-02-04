package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.Country;
import ua.repository.CountryRepository;
import ua.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Country findOne(int id) {
		
		return countryRepository.findOne(id);
	}

	@Override
	public List<Country> findAll() {
		
		return countryRepository.findAll();
	}

	@Override
	public void save(Country country) {
		countryRepository.save(country);
		
	}

	@Override
	public void delete(int id) {
		countryRepository.delete(id);
		
	}
	
	
	
}
