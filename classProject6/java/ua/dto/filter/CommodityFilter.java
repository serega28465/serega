package ua.dto.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CommodityFilter {
	
	private static final Pattern PEATTERN = Pattern.compile("[0-9]+");

	private String search = "";
	
	private String maxPrice = "";
	
	private String minPrice = "";
	
	private Integer max;
	
	private Integer min;
	
	private List<Integer> producers = new ArrayList<>();

	private List<Integer> categorys = new ArrayList<>();
	
	private List<Integer> verhs = new ArrayList<>();
	
	private List<Integer> nizs = new ArrayList<>();
	
	private List<Integer> obechaikas = new ArrayList<>();
	
	private List<Integer> grifs = new ArrayList<>();
	
	
	
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		if(PEATTERN.matcher(maxPrice).matches())max = Integer.valueOf(maxPrice);
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		if(PEATTERN.matcher(minPrice).matches())min = Integer.valueOf(minPrice);
		this.minPrice = minPrice;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public List<Integer> getProducers() {
		return producers;
	}

	public void setProducers(List<Integer> producers) {
		this.producers = producers;
	}

	public static Pattern getPeattern() {
		return PEATTERN;
	}

	public List<Integer> getCategorys() {
		return categorys;
	}

	public void setCategorys(List<Integer> categorys) {
		this.categorys = categorys;
	}

	public List<Integer> getVerhs() {
		return verhs;
	}

	public void setVerhs(List<Integer> verhs) {
		this.verhs = verhs;
	}

	public List<Integer> getNizs() {
		return nizs;
	}

	public void setNizs(List<Integer> nizs) {
		this.nizs = nizs;
	}

	public List<Integer> getObechaikas() {
		return obechaikas;
	}

	public void setObechaikas(List<Integer> obechaikas) {
		this.obechaikas = obechaikas;
	}

	public List<Integer> getGrifs() {
		return grifs;
	}

	public void setGrifs(List<Integer> grifs) {
		this.grifs = grifs;
	}

	
	
	


}
