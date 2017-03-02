package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category extends AbstractEntity{

	
	private String category;

	@OneToMany(mappedBy="category")
	List<Commodity> commoditys = new ArrayList();

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Commodity> getCommoditys() {
		return commoditys;
	}

	public void setCommoditys(List<Commodity> commoditys) {
		this.commoditys = commoditys;
	}
	
	
	
	
}
