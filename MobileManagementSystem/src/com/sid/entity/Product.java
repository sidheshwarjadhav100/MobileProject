package com.sid.entity;

public class Product {

	private int id;
	private String cname;
	private String series;
	private int price;

	public Product() {
		super();
	}

	public Product(int id, String brand, String series, int price) {
		super();
		this.id = id;
		this.cname = brand;
		this.series = series;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return cname;
	}

	public void setBrand(String brand) {
		this.cname = brand;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", cname=");
		builder.append(cname);
		builder.append(", series=");
		builder.append(series);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
