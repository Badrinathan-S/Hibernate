package com.hibernate.inheritance;

import javax.persistence.Entity;

@Entity
public class Testing extends Project {
	
	private String type;
	private String tools;
	private int teamLength;
	public Testing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Testing(String name, String client, String manager) {
		super(name, client, manager);
		// TODO Auto-generated constructor stub
	}
	public Testing(String type, String tools, int teamLength) {
		super();
		this.type = type;
		this.tools = tools;
		this.teamLength = teamLength;
	}
	@Override
	public String toString() {
		return "Testing [type=" + type + ", tools=" + tools + ", teamLength=" + teamLength
				+ "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTools() {
		return tools;
	}
	public void setTools(String tools) {
		this.tools = tools;
	}
	public int getTeamLength() {
		return teamLength;
	}
	public void setTeamLength(int teamLength) {
		this.teamLength = teamLength;
	}

}
