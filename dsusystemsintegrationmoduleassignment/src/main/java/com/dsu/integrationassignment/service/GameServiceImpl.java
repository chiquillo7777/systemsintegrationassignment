package com.dsu.integrationassignment.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.dsu.integrationassignment.model.Game;

@Service
public class GameServiceImpl implements GameService {

	Map<Long, Game> games = new HashMap<>();
	long id = 123;
	
	@Override
	public List<Game> searchAll(){
	Collection<Game> results = games.values();
	List<Game> response = new ArrayList<>(results);
		return response;
	}

	@Override
	public void addGame(Game game) {
		game.setId(++id);
		games.put(game.getId(), game);
		
	}

	@Override
	public Game searchGameById(long id) {
		Game game = games.get(id);
		return game;
	}

	@Override
	public Response deleteGame(long id) {
		if(games.get(id) != null) {
			games.remove(id);
		}
		return null;
	}

	@Override
	public List<Game> searchByCategory(String category) {
		Collection<Game> results = games.values();
		List<Game> response = new ArrayList<>(results);
		List<Game> responseResults = null;
		
		for(Game game : response) {
			if(game.getCategory() == "test") {
				int key = (int) game.getId();
				responseResults = (List<Game>) response.get(key);
			}else {
				System.out.println("NO JUNCIONO BB");
			}
			
		}
		
		
		return responseResults;
	}

}
