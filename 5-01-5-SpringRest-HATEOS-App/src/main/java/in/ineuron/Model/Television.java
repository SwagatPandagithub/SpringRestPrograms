package in.ineuron.Model;

import org.springframework.hateoas.RepresentationModel;

public class Television extends RepresentationModel{
	
	private String brand;
	private String model;
	private String size;
	private String price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Television(String brand, String model, String size, String price) {
		super();
		this.brand = brand;
		this.model = model;
		this.size = size;
		this.price = price;
	}
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Television [brand=" + brand + ", model=" + model + ", size=" + size + ", price=" + price + "]";
	}
	
	

}
