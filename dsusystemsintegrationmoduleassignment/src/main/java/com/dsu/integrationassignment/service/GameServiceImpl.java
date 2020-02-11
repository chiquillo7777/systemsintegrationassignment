package com.dsu.integrationassignment.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.dsu.integrationassignment.model.Game;

@Service
public class GameServiceImpl implements GameService {

	Map<Long, Game> games = new HashMap<>();
	long id = 123;

	@Override
	public List<Game> searchAll() {
		List<Game> listOfGames = new ArrayList<>();
		
		for(Game game : games.values()) {
				listOfGames.add(game);
		}
		return listOfGames;
	}

	@Override
	public void addGame(Game game) {
		Game newGame = new Game();
		
		newGame.setId(++id);
		newGame.setName(game.getName());
		newGame.setGameproducer(game.getGameproducer());
		newGame.setCategory(game.getCategory());
		newGame.setCharacter(game.getCharacter());
		//newGame.setCharactername(game.getCharactername());
		//newGame.setRole(game.getRole());
		//newGame.setUrl(game.getUrl());
		
		
		
		games.put(newGame.getId(), newGame);

	}

	@Override
	public Game searchGameById(long id) {
		Game game = games.get(id);
		return game;
	}

	@Override
	public Response deleteGame(long id) {
		if (games.get(id) != null) {
			games.remove(id);
		}
		return null;
	}

	@Override
	public List<Game> searchByCategory(String category) {
		
		List<Game> listOfGames = new ArrayList<>();
		
		/* games.values().forEach(
		            (e -> {
		                if (e.getCategory() == category) {
		                	Game test = new Game();
		                	test= e;
		                	System.out.println(test);
		                	listOfGames.add(test);
		                } 
		            }
		    ));*/
		
		for(Game game : games.values()) {
			
			System.out.println(game.getCategory());
			if(game.getCategory().equals(category)) {
				listOfGames.add(game);
				System.out.println(listOfGames.get(0));
			}
			
		}
		
		
		/*Iterator<Map.Entry<Long, Game>> it =  games.entrySet().iterator();
		Map.Entry<Long, Game> entry = it.next();
		System.out.println("Before while");
		
		while (it.hasNext()) {
			System.out.println("In the while");
			Game game =  entry.getValue();
			if (game.getCategory() == category) {
				
				System.out.println("In the if");
				listOfGames.add(game);
				System.out.println("");
			}else {
				System.out.println("in the else");
				break;
			}
		}*/
		
		/*Set<Map.Entry<Long, Game>> entrySet = games.entrySet();
		
		
		for (Entry<Long, Game> entry : entrySet) {
			if(entry.getValue().getCategory()==category) {
				listOfGames.add(entry.);
			}
		}*/

		return listOfGames;
	}

	@Override
	public void updateGameById(Long id, Game game) {
		System.out.println(id);
		if (games.get(id) != null) {
			game.setId(id);
			games.remove(id);
			games.put(id, game);
		}
	}

}
