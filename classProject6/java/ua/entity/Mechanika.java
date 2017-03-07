package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mechanika")
public class Mechanika  extends AbstractEntity{

	
	private String mechanika;

	@OneToMany(mappedBy="mechanika")
	List<Commodity> commoditys = new ArrayList();

	public String getMechanika() {
		return mechanika;
	}

	public void setMechanika(String mechanika) {
		this.mechanika = mechanika;
	}

	public List<Commodity> getCommoditys() {
		return commoditys;
	}

	public void setCommoditys(List<Commodity> commoditys) {
		this.commoditys = commoditys;
	}


	
	
	
}
