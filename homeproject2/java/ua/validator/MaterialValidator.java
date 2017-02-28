package ua.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.Category;
import ua.entity.Material;
import ua.service.CategoryService;
import ua.service.MaterialService;

public class MaterialValidator implements Validator{

	private final MaterialService materialService;

	public MaterialValidator(MaterialService materialService) {
		this.materialService = materialService;
	}


	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Material.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Material material = (Material) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "material", "", "Can`t be empty");
		if(materialService.findByMaterial(material.getMaterial())!=null){
			errors.rejectValue("material", "", "Already exist");
		}
	}
}