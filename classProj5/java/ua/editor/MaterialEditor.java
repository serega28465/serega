package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Material;
import ua.entity.Producer;
import ua.service.MaterialService;
import ua.service.ProducerService;

public class MaterialEditor extends PropertyEditorSupport {

	private final MaterialService serviceMaterial;

	public MaterialEditor(MaterialService serviceMaterial) {
		this.serviceMaterial = serviceMaterial;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Material material = serviceMaterial.findOne(Integer.valueOf(text));
		setValue(material);
	}
	
}

