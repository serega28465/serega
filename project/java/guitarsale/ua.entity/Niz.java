package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="niz")
public class Niz extends AbstractEntity{

	private String material;

	@OneToMany(mappedBy="materials")
	List<Commodity> com_niz = new ArrayList();
	
	
	public List<Commodity> getCom_niz() {
		return com_niz;
	}

	public void setCom_niz(List<Commodity> com_niz) {
		this.com_niz = com_niz;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
}
