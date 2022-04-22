package com.hibernate.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Iplteams {
	
	@Id
	private Integer rank;
	private String name;
	private Integer matchs;
	private Integer wins;
	private Integer loss;
	private String captain;
	
	@Override
	public String toString() {
		return "IplTeams [rank=" + rank + ", name=" + name + ", matchs=" + matchs + ", won=" + wins + ", loss=" + loss
				+ ", captain=" + captain + "]";
	}
	/**
	 * 
	 */
	public Iplteams() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param rank
	 * @param name
	 * @param matchs
	 * @param won
	 * @param loss
	 * @param captain
	 */
	public Iplteams(Integer rank, String name, Integer matchs, Integer won, Integer loss, String captain) {
		super();
		this.rank = rank;
		this.name = name;
		this.matchs = matchs;
		this.wins = won;
		this.loss = loss;
		this.captain = captain;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getmatchs() {
		return matchs;
	}
	public void setmatchs(Integer matchs) {
		this.matchs = matchs;
	}
	public Integer getWon() {
		return wins;
	}
	public void setWon(Integer won) {
		this.wins = won;
	}
	public Integer getLoss() {
		return loss;
	}
	public void setLoss(Integer loss) {
		this.loss = loss;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	
	
	
	
}
