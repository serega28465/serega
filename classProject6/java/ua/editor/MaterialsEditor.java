package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Material;
import ua.entity.Materials;
import ua.entity.Producer;
import ua.service.MaterialService;
import ua.service.MaterialsService;
import ua.service.ProducerService;

public class MaterialsEditor extends PropertyEditorSupport {

	private final MaterialsService serviceMaterials;
	


	public MaterialsEditor(MaterialsService serviceMaterials) {
		this.serviceMaterials = serviceMaterials;
	}
	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Materials materials  = serviceMaterials.findOne(Integer.valueOf(text));
		setValue(materials);
		
	}
	
}
