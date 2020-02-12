

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;


public class GameWSClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/api/services/gameservice/game");
		Builder request = target.request();
		String response =  request.get(String.class);
				
		System.out.println(response);
		
		
		
	}

}
