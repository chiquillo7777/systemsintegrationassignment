package com.dsu.integrationassignment.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.dsu.integrationassignment.model.Game;


@Path("gameservice")
@Consumes("application/xml")
@Produces("application/xml")
public interface GameService{
	
	@GET
	@Path("/game")
	List<Game> searchAll();
	
	@GET
	@Path("/game/{id}")
	Game searchGameById(@PathParam("id") long id);
	
	@GET
	@Path("/game/{category}")
	List<Game> searchByCategory(@PathParam("category") String category);
	
	@POST
	@Path("/game")
	void addGame(Game game);
	
	
	@DELETE
	@Path("/game")
	Response deleteGame(@QueryParam("id") long id);
}
