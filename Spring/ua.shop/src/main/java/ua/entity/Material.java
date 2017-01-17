package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="material")
public class Material extends AbstractEntity{

	
	private String material;
	
	@OneToMany(mappedBy="verh")
	List<Materials> verhs = new ArrayList<>();
	@OneToMany(mappedBy="niz")
	List<Materials> nizs = new ArrayList<>();
	@OneToMany(mappedBy="obechaika")
	List<Materials> obechaikas = new ArrayList<>();
	@OneToMany(mappedBy="grif")
	List<Materials> grifs = new ArrayList<>();
	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public List<Materials> getVerhs() {
		return verhs;
	}
	public void setVerhs(List<Materials> verhs) {
		this.verhs = verhs;
	}
	public List<Materials> getNizs() {
		return nizs;
	}
	public void setNizs(List<Materials> nizs) {
		this.nizs = nizs;
	}
	public List<Materials> getObechaikas() {
		return obechaikas;
	}
	public void setObechaikas(List<Materials> obechaikas) {
		this.obechaikas = obechaikas;
	}
	public List<Materials> getGrifs() {
		return grifs;
	}
	public void setGrifs(List<Materials> grifs) {
		this.grifs = grifs;
	}
	
	
}