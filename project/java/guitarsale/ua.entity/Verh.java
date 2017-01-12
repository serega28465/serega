package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="verh")
public class Verh extends AbstractEntity{

	private String material;

	@OneToMany(mappedBy="materials")
	List<Commodity> com_verh = new ArrayList();
	
	
	public List<Commodity> getCom_verh() {
		return com_verh;
	}

	public void setCom_verh(List<Commodity> com_verh) {
		this.com_verh = com_verh;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
