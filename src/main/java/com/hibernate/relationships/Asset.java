package com.hibernate.relationships;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Asset {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String name;
	private Integer value;
	
	@Override
	public String toString() {
		return "Asset [ID=" + ID + ", name=" + name + ", value=" + value + "]";
	}
	/**
	 * 
	 */
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param value
	 */
	public Asset(String name, Integer value) {
		super();
		this.name = name;
		this.value = value;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
	
}
