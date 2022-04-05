package com.hibernate.temporaltransiantinsertable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Laptop {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(insertable = false)
	private String model;
	@Temporal(TemporalType.DATE)
	private Date boughtOn;
	private String brand;
	@Transient
	private Integer price;
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + ", boughtOn=" + boughtOn + ", brand=" + brand + ", price="
				+ price + "]";
	}
	/**
	 * 
	 */
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param model
	 * @param date
	 * @param brand
	 * @param price
	 */
	public Laptop(String model, Date date, String brand, Integer price) {
		super();
		this.model = model;
		this.boughtOn = date;
		this.brand = brand;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getBoughtOn() {
		return boughtOn;
	}
	public void setBoughtOn(Date boughtOn) {
		this.boughtOn = boughtOn;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
