package com.hibernate.relationships;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String name;
	private Integer age;
	private String gender;
	
	@OneToOne
	@JoinColumn(name = "Asset_ID")
	private Asset asset;
	
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", age=" + age + ", gender=" + gender + ", asset=" + asset + "]";
	}

	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param asset
	 */
	public Person(String name, Integer age, String gender, Asset asset) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.asset = asset;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	
	
	
}
