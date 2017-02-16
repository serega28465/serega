package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.entity.Producer;
import ua.service.ProducerService;

public class ProducerEditor extends PropertyEditorSupport {

	private final ProducerService serviceProducer;

	public ProducerEditor(ProducerService serviceProducer) {
		this.serviceProducer = serviceProducer;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Producer producer = serviceProducer.findOne(Integer.valueOf(text));
		setValue(producer);
	}
	
}
