package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Category;
import ua.entity.Producer;
import ua.service.CategoryService;
import ua.service.ProducerService;

public class CategoryEditor extends PropertyEditorSupport {

	private final CategoryService serviceCategory;

	public CategoryEditor(CategoryService serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Category category = serviceCategory.findOne(Integer.valueOf(text));
		setValue(category);
	}
	
}
