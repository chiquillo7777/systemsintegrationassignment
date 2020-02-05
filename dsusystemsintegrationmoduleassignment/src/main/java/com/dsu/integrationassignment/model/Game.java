package com.dsu.integrationassignment.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Game {
	private long id;
	private String name;
	private String gameProducer;
	private String category;
	private String characterName;
	private String role;
	private String url;

	
	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGameProducer() {
		return gameProducer;
	}

	public void setGameProducer(String gameProducer) {
		this.gameProducer = gameProducer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
