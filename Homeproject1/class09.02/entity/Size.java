package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="size")
public class Size  extends AbstractEntity{


	private String size;

	@OneToMany(mappedBy="size")
	List<Commodity> commoditys = new ArrayList();

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<Commodity> getCommoditys() {
		return commoditys;
	}

	public void setCommoditys(List<Commodity> commoditys) {
		this.commoditys = commoditys;
	}
	
	
	
	
	
}
