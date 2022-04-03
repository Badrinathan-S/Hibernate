package com.hibernate.embeddable;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Name;
	
	@Embedded
	private Address presentAddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="Street", column = @Column(name="permanent_street")),
		@AttributeOverride(name="City", column = @Column(name="permanent_city")),
		@AttributeOverride(name="State", column = @Column(name="permanent_state"))
	})
	private Address permanentAddress;
	private Integer Number;
	private String DOB;
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", presentAddress=" + presentAddress + ", permanentAddress="
				+ permanentAddress + ", Number=" + Number + ", DOB=" + DOB + "]";
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param presentAddress
	 * @param permanentAddress
	 * @param number
	 * @param dOB
	 */
	public User(String name, Address presentAddress, Address permanentAddress, Integer number, String dOB) {
		super();
		Name = name;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
		Number = number;
		DOB = dOB;
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
	public Address getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Integer getNumber() {
		return Number;
	}
	public void setNumber(Integer number) {
		Number = number;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	
	
}
