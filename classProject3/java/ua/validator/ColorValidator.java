package ua.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import ua.entity.Color;

import ua.service.ColorService;

public class ColorValidator implements Validator{

	private final ColorService colorService;

	public ColorValidator(ColorService colorService) {
		this.colorService = colorService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Color.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Color color = (Color) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "color", "", "Поле не може бути порожнім!");
		if(colorService.findByColor(color.getColor())!=null){
			errors.rejectValue("color", "", "Такий колір вже існує!");
		}
	}
}