package com.hibernate.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class Project {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int proID;
	private String name;
	private String client;
	private String manager;
	
	@Override
	public String toString() {
		return "Project [proID=" + proID + ", name=" + name + ", client=" + client + ", manager=" + manager + "]";
	}
	/**
	 * 
	 */
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param client
	 * @param manager
	 */
	public Project(String name, String client, String manager) {
		super();
		this.name = name;
		this.client = client;
		this.manager = manager;
	}
	public int getProID() {
		return proID;
	}
	public void setProID(int proID) {
		this.proID = proID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
}
