package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grif")
public class Grif extends AbstractEntity{

	private String grif;

	@OneToMany(mappedBy="materials")
	List<Commodity> com_grif = new ArrayList();
	
	
	public List<Commodity> getCom_grif() {
		return com_grif;
	}

	public void setCom_grif(List<Commodity> com_grif) {
		this.com_grif = com_grif;
	}

	public String getGrif() {
		return grif;
	}

	public void setGrif(String grif) {
		this.grif = grif;
	}
	
	
	
}
