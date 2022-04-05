package com.hibernate.cache;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Cars {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String Name;
	private String Model;
	private Integer Price;
	
	@Override
	public String toString() {
		return "Cars [Id=" + Id + ", Name=" + Name + ", Model=" + Model + ", Price=" + Price + "]";
	}
	/**
	 * 
	 */
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param model
	 * @param i
	 */
	public Cars(String name, String model, Integer price) {
		super();
		Name = name;
		Model = model;
		Price = price;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	
	
}
