package ua.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="commodity")
public class Commodity extends AbstractEntity{

	
	@ManyToOne(fetch = FetchType.LAZY)
	private Category category;
	@ManyToOne(fetch = FetchType.LAZY)
	private Producer producer;
	@ManyToOne(fetch = FetchType.LAZY)
	private Country country;
	@ManyToOne(fetch = FetchType.LAZY)
	private Model model;
	@ManyToOne(fetch = FetchType.LAZY)
	private Materials materials;
	@ManyToOne(fetch = FetchType.LAZY)
	private Color color;
	@ManyToOne(fetch = FetchType.LAZY)
	private Mechanika mechanika;
	@ManyToOne(fetch = FetchType.LAZY)
	private Size size;
	private BigDecimal price;
	
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	
	
}
