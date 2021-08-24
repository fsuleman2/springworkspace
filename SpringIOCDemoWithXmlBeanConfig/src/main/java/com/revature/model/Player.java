package com.revature.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Player implements Serializable {
	private Integer playerJerseyNo;
	private String playerName;
	private String teamName;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(Integer playerJerseyNo, String playerName, String teamName) {
		super();
		this.playerJerseyNo = playerJerseyNo;
		this.playerName = playerName;
		this.teamName = teamName;
	}

	public Integer getPlayerJerseyNo() {
		return playerJerseyNo;
	}
	public void setPlayerJerseyNo(Integer playerJerseyNo) {
		this.playerJerseyNo = playerJerseyNo;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public String toString() {
		return "Player [playerJerseyNo=" + playerJerseyNo + ", playerName=" + playerName + ", teamName=" + teamName
				+ "]";
	}
	
	
}
