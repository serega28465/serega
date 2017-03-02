package ua.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.Category;
import ua.entity.Mechanika;
import ua.service.CategoryService;
import ua.service.MechanikaService;

public class MechanikaValidator implements Validator{

	private final MechanikaService mechanikaService;

	public MechanikaValidator(MechanikaService mechanikaService) {
		this.mechanikaService = mechanikaService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Mechanika.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Mechanika mechanika = (Mechanika) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mechanika", "", "Can`t be empty");
		if(mechanikaService.findByMechanika(mechanika.getMechanika())!=null){
			errors.rejectValue("mechanika", "", "Already exist");
		}
	}
}
