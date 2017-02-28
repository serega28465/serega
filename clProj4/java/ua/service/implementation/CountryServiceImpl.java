package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Country;
import ua.repository.CountryRepository;
import ua.service.CountryService;
import ua.service.specification.CategorySpecification;
import ua.service.specification.CountrySpecification;

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

	@Override
	public Country findByCountry(String country) {
		// TODO Auto-generated method stub
		return countryRepository.findByCountry(country);
	}

	@Override
	public Page<Country> findAll(BasicFilter filter, Pageable pageable) {
		// TODO Auto-generated method stub
		return countryRepository.findAll(new CountrySpecification(filter), pageable);
	}
	
	
}
