package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Producer;
import ua.entity.Size;
import ua.service.ProducerService;
import ua.service.SizeService;

public class SizeEditor extends PropertyEditorSupport {

	private final SizeService serviceSize;

	public SizeEditor(SizeService serviceSize) {
		this.serviceSize = serviceSize;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Size size = serviceSize.findOne(Integer.valueOf(text));
		setValue(size);
	}
	
}
