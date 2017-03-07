package ua.validator;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.dto.form.CommodityForm;


public class CommodityValidator implements Validator{
	
	private final static Pattern PATTERN = Pattern.compile("^([0-9]{1,18}\\.[0-9]{0,2})|([0-9]{1,18}\\,[0-9]{0,2})$");

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(CommodityForm.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		CommodityForm commodity = (CommodityForm) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "", "Can`t be empty");

	}

}
