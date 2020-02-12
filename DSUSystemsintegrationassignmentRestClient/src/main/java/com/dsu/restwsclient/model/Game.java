package com.dsu.restwsclient.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="Game")
public class Game {
	private long id;
	private String name;
	private String gameproducer;
	private List<String> category;
	private List<Character> characters;
	
	

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


	public String getGameproducer() {
		return gameproducer;
	}

	public void setGameproducer(String gameproducer) {
		this.gameproducer = gameproducer;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	



	

}
