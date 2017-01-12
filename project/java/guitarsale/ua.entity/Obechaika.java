package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="obechaika")
public class Obechaika extends AbstractEntity{

	private String material;

	@OneToMany(mappedBy="materials")
	List<Commodity> com_obechaika = new ArrayList();
	
	
	public List<Commodity> getCom_obechaika() {
		return com_obechaika;
	}

	public void setCom_obechaika(List<Commodity> com_obechaika) {
		this.com_obechaika = com_obechaika;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
}
