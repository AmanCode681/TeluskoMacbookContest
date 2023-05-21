package pms;

public class Product {

	private String name;
	private String type;
	private String place;
	private Waranty waranty;
	public Product(String name, String type, String place, Waranty waranty) {
		super();
		this.name = name;
		this.type = type;
		this.place = place;
		this.waranty = waranty;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Waranty getWaranty() {
		return waranty;
	}

	public void setWaranty(Waranty waranty) {
		this.waranty = waranty;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", place=" + place + ", waranty=" + waranty + "]";
	}
	
}
