package com.hibernate.inheritance;

import javax.persistence.Entity;

@Entity
public class Developement extends Project {
	
	private String technology;
	private int backlog;
	private String past;
	
	/**
	 * 
	 */
	public Developement() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param client
	 * @param manager
	 */
	public Developement(String name, String client, String manager) {
		super(name, client, manager);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param technology
	 * @param backlog
	 * @param past
	 */
	public Developement(String technology, int backlog, String past) {
		super();
		this.technology = technology;
		this.backlog = backlog;
		this.past = past;
	}
	@Override
	public String toString() {
		return "Development [ technology=" + technology + ", backlog=" + backlog
				+ ", past=" + past + "]";
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public int getBacklog() {
		return backlog;
	}
	public void setBacklog(int backlog) {
		this.backlog = backlog;
	}
	public String getPast() {
		return past;
	}
	public void setPast(String past) {
		this.past = past;
	}
}
