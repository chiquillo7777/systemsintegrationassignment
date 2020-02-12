package jerseyws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Character {
	private String name;
	private String rol;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
