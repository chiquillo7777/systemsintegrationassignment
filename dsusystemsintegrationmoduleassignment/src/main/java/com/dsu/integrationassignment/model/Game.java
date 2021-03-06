package com.dsu.integrationassignment.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Game {
	private long id;
	private String name;
	private String gameproducer;
	private List<String> categories;
	//@XmlElement(type = Character.class)
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

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	

	



	

}
