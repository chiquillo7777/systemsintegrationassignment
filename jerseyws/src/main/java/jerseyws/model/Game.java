package jerseyws.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Game {
	private long id;
	private String name;
	private String gameproducer;
	private List<String> category;
	private List<Character> character;
	
	

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

	public List<Character> getCharacter() {
		return character;
	}

	public void setCharacter(List<Character> character) {
		this.character = character;
	}



	

}
