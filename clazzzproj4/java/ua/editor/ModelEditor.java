package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Model;
import ua.entity.Producer;
import ua.service.ModelService;
import ua.service.ProducerService;

public class ModelEditor extends PropertyEditorSupport {

	private final ModelService serviceModel;

	public ModelEditor(ModelService serviceModel) {
		this.serviceModel = serviceModel;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Model model = serviceModel.findOne(Integer.valueOf(text));
		setValue(model);
	}
	
}

