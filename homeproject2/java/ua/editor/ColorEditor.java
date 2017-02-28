package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Color;
import ua.service.ColorService;

public class ColorEditor extends PropertyEditorSupport {

	private final ColorService serviceColor;

	public ColorEditor(ColorService serviceColor) {
		this.serviceColor = serviceColor;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Color color = serviceColor.findOne(Integer.valueOf(text));
		setValue(color);
	}
	
}
