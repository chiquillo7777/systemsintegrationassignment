package jerseyws.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import jerseyws.model.Game;

public class MyClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		Game game = client.target("http://localhost:8080/api/services/gameservice/game").request().get(Game.class);
		System.out.println(game.getName());
	}

}
