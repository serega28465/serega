package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="materials")
public class Materials  extends AbstractEntity{

	private String verh;
	private String niz;
	private String obechaika;
	private String grif;
	
	@OneToMany(mappedBy="materials")
	List<Commodity> com_verh = new ArrayList();
	
	@OneToMany(mappedBy="materials")
	List<Commodity> com_niz = new ArrayList();

	@OneToMany(mappedBy="materials")
	List<Commodity> com_obechaika = new ArrayList();
	
	@OneToMany(mappedBy="materials")
	List<Commodity> com_grif = new ArrayList();

	public String getVerh() {
		return verh;
	}

	public void setVerh(String verh) {
		this.verh = verh;
	}

	public String getNiz() {
		return niz;
	}

	public void setNiz(String niz) {
		this.niz = niz;
	}

	public String getObechaika() {
		return obechaika;
	}

	public void setObechaika(String obechaika) {
		this.obechaika = obechaika;
	}

	public String getGrif() {
		return grif;
	}

	public void setGrif(String grif) {
		this.grif = grif;
	}

	public List<Commodity> getCom_verh() {
		return com_verh;
	}

	public void setCom_verh(List<Commodity> com_verh) {
		this.com_verh = com_verh;
	}

	public List<Commodity> getCom_niz() {
		return com_niz;
	}

	public void setCom_niz(List<Commodity> com_niz) {
		this.com_niz = com_niz;
	}

	public List<Commodity> getCom_obechaika() {
		return com_obechaika;
	}

	public void setCom_obechaika(List<Commodity> com_obechaika) {
		this.com_obechaika = com_obechaika;
	}

	public List<Commodity> getCom_grif() {
		return com_grif;
	}

	public void setCom_grif(List<Commodity> com_grif) {
		this.com_grif = com_grif;
	}

	
}
