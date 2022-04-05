package com.hibernate.embeddable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String Name;

//	@Embedded
	@ElementCollection
	@JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "user_id"))
	@GenericGenerator(name = "addressid", strategy = "sequence")
	@CollectionId(generator = "addressid", columns = { @Column(name = "address_id") }, type = @Type(type = "long"))
	private Collection<Address> address = new ArrayList<Address>();

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", address=" + address + ", Number=" + Number + ", DOB=" + DOB
				+ "]";
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
	 * @param address
	 * @param number
	 * @param dOB
	 */
	public User(String name, Collection<Address> address, Integer number, String dOB) {
		super();
		Name = name;
		this.address = address;
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

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
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

	// private Address address;
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name="Street", column = @Column(name="permanent_street")),
//		@AttributeOverride(name="City", column = @Column(name="permanent_city")),
//		@AttributeOverride(name="State", column = @Column(name="permanent_state"))
//	})
//	private Address permanentAddress;
	private Integer Number;
	private String DOB;

//	@Override
//	public String toString() {
//		return "User [Id=" + Id + ", Name=" + Name + ", presentAddress=" + presentAddress + ", permanentAddress="
//				+ permanentAddress + ", Number=" + Number + ", DOB=" + DOB + "]";
//	}
//	/**
//	 * 
//	 */
//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	/**
//	 * @param name
//	 * @param presentAddress
//	 * @param permanentAddress
//	 * @param number
//	 * @param dOB
//	 */
//	public User(String name, Address presentAddress, Address permanentAddress, Integer number, String dOB) {
//		super();
//		Name = name;
//		this.presentAddress = presentAddress;
//		this.permanentAddress = permanentAddress;
//		Number = number;
//		DOB = dOB;
//	}
//	public Integer getId() {
//		return Id;
//	}
//	public void setId(Integer id) {
//		Id = id;
//	}
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
//	public Address getPresentAddress() {
//		return presentAddress;
//	}
//	public void setPresentAddress(Address presentAddress) {
//		this.presentAddress = presentAddress;
//	}
//	public Address getPermanentAddress() {
//		return permanentAddress;
//	}
//	public void setPermanentAddress(Address permanentAddress) {
//		this.permanentAddress = permanentAddress;
//	}
//	public Integer getNumber() {
//		return Number;
//	}
//	public void setNumber(Integer number) {
//		Number = number;
//	}
//	public String getDOB() {
//		return DOB;
//	}
//	public void setDOB(String dOB) {
//		DOB = dOB;
//	}

}
