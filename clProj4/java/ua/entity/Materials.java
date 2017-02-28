package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="materials")
public class Materials  extends AbstractEntity{

	@ManyToOne(fetch = FetchType.LAZY)
	private Material verh;
	@ManyToOne(fetch = FetchType.LAZY)
	private Material niz;
	@ManyToOne(fetch = FetchType.LAZY)
	private Material obechaika;
	@ManyToOne(fetch = FetchType.LAZY)
	private Material grif;
	
	
	@OneToMany(mappedBy = "materials")
	List<Commodity> commodity = new ArrayList<>();
	
	

	public Material getVerh() {
		return verh;
	}
	public void setVerh(Material verh) {
		this.verh = verh;
	}
	public Material getNiz() {
		return niz;
	}
	public void setNiz(Material niz) {
		this.niz = niz;
	}
	public Material getObechaika() {
		return obechaika;
	}
	public void setObechaika(Material obechaika) {
		this.obechaika = obechaika;
	}
	public Material getGrif() {
		return grif;
	}
	public void setGrif(Material grif) {
		this.grif = grif;
	}
	public List<Commodity> getCommodity() {
		return commodity;
	}
	public void setCommodity(List<Commodity> commodity) {
		this.commodity = commodity;
	}
	public String getMaterials() {
		// TODO Auto-generated method stub
		
		return verh +(" ")+ niz+(" ") + obechaika +(" ")+ grif;
	}
	public void setMaterials(Material verh,Material niz,Material obechaika,Material grif) {
		this.verh = verh;
		this.niz = niz;
		this.obechaika = obechaika;
		this.grif = grif;
	}
	
}