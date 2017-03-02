package ua.dto.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.springframework.web.multipart.MultipartFile;

import ua.entity.Category;
import ua.entity.Color;
import ua.entity.Country;
import ua.entity.Materials;
import ua.entity.Mechanika;
import ua.entity.Model;
import ua.entity.Producer;
import ua.entity.Size;



public class CommodityForm {

	private int id;
	
	private BigDecimal price;


	private Category category;

	private Producer producer;

	private Country country;

	private Model model;

	private Materials materials;

	private Color color;

	private Mechanika mechanika;

	private Size size;
	
	private MultipartFile file;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Materials getMaterials() {
		return materials;
	}

	public void setMaterials(Materials materials) {
		this.materials = materials;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Mechanika getMechanika() {
		return mechanika;
	}

	public void setMechanika(Mechanika mechanika) {
		this.mechanika = mechanika;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	

	
	
}