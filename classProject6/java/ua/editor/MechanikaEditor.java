package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Mechanika;
import ua.entity.Producer;
import ua.service.MechanikaService;
import ua.service.ProducerService;

public class MechanikaEditor extends PropertyEditorSupport {

	private final MechanikaService serviceMechanika;

	public MechanikaEditor(MechanikaService serviceMechanika) {
		this.serviceMechanika = serviceMechanika;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Mechanika mechanika = serviceMechanika.findOne(Integer.valueOf(text));
		setValue(mechanika);
	}
	
}

