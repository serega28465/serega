package ua.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.Category;
import ua.entity.Country;
import ua.service.CategoryService;
import ua.service.CountryService;

public class CountryValidator implements Validator{

	private final CountryService countryService;

	public CountryValidator(CountryService countryService) {
		this.countryService = countryService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Country.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Country country = (Country) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "", "Can`t be empty");
		if(countryService.findByCountry(country.getCountry())!=null){
			errors.rejectValue("country", "", "Already exist");
		}
	}
}