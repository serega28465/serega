package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Country;
import ua.service.CountryService;

public class CountryEditor extends PropertyEditorSupport {

	private final CountryService serviceCountry;

	public CountryEditor(CountryService serviceCountry) {
		this.serviceCountry = serviceCountry;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Country country = serviceCountry.findOne(Integer.valueOf(text));
		setValue(country);
	}
	
}
