package ua.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.dto.form.ModelForm;
import ua.entity.Model;

import ua.service.ModelService;

public class ModelValidator implements Validator{

	private final ModelService modelService;

	public ModelValidator(ModelService modelService) {
		this.modelService = modelService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Model.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Model model = (Model) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "", "Can`t be empty");
		if(modelService.findByModel(model.getModel())!=null){
			errors.rejectValue("model", "", "Already exist");
		}
	}
}
