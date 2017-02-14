package ua.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ua.entity.Category;
import ua.entity.Materials;
import ua.service.CategoryService;
import ua.service.MaterialsService;

public class MaterialsValidator implements Validator{

	private final MaterialsService materialsService;

	public MaterialsValidator(MaterialsService materialsService) {
		this.materialsService = materialsService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Materials.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Materials materials = (Materials) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "materials", "", "Can`t be empty");
		if(materialsService.findByMaterials(materials.getVerh(), materials.getNiz(), materials.getObechaika(), materials.getGrif())!=null){
			errors.rejectValue("materials", "", "Already exist");
		}
	}
}