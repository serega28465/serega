package core.dz11;

public class Commodity implements Comparable<Commodity>{

	private String name;
	
	private String producer;
	
	private double price;
	
	private CommodityType comT;




	public Commodity(String name, String producer, double price,
			CommodityType comT) {
		super();
		this.name = name;
		this.producer = producer;
		this.price = price;
		this.comT = comT;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getProducer() {
		return producer;
	}




	public void setProducer(String producer) {
		this.producer = producer;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public CommodityType getComT() {
		return comT;
	}




	public void setComT(CommodityType comT) {
		this.comT = comT;
	}




	@Override
	public String toString() {
		return "Commodity [name=" + name + ", producer=" + producer
				+ ", price=" + price + ", comT=" + comT + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comT == null) ? 0 : comT.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((producer == null) ? 0 : producer.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (comT != other.comT)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		return true;
	}




	@Override
	public int compareTo(Commodity a) {
		return name.compareTo(a.name);
	}
	
	
}
