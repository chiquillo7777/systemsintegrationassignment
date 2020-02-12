

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;


import com.dsu.restwsclient.model.Game;

public class GameWSClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/api/services/gameservice/game");
		Builder request = target.request();
		Game game =  request.get(Game.class);
		
		System.out.println(game.getName());
		
		
		
	}

}
