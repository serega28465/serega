package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Material;
import ua.entity.Producer;
import ua.service.MaterialService;
import ua.service.MaterialsService;
import ua.service.ProducerService;

public class MaterialsEditor extends PropertyEditorSupport {

	private final MaterialsService serviceMaterials;
	
	private final MaterialService serviceMaterial;

	public MaterialsEditor(MaterialsService serviceMaterials, MaterialService serviceMaterial) {
		this.serviceMaterials = serviceMaterials;
		this.serviceMaterial = serviceMaterial;
	}
	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Material verh  = serviceMaterial.findOne(Integer.valueOf(text));
		setValue(verh);
		Material niz  = serviceMaterial.findOne(Integer.valueOf(text));
		setValue(niz);
		Material obechaika  = serviceMaterial.findOne(Integer.valueOf(text));
		setValue(obechaika);
		Material grif  = serviceMaterial.findOne(Integer.valueOf(text));
		setValue(grif);
		
	}
	
}
