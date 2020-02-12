package com.dsu.integrationassignment.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.dsu.integrationassignment.model.Character;
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
		//Game newGame = new Game();
		
		//newGame.setId(++id);
		//newGame.setName(game.getName());
		//newGame.setGameproducer(game.getGameproducer());
		//newGame.setCategory(game.getCategory());
		//newGame.setCharacter(game.getCharacter());
		//newGame.setCharactername(game.getCharactername());
		//newGame.setRole(game.getRole());
		//newGame.setUrl(game.getUrl());
		
		game.setId(id);
		
		games.put(id, game);
		id++;

	}

	@Override
	public Game searchGameById(long id) {
		Game game = games.get(id);
		return game;
	}

	@Override
	public Response deleteGame(long id) {
		
			games.remove(id);
		
		return null;
	}

	@Override
	public List<Game> searchByCategory(String category) {
		
		
		
		List<Game> listOfGames = new ArrayList<>();
	
		
		for(Game game : games.values()) {
			int i =0;
			System.out.println(game.getCategories());
			if(game.getCategories().get(i).equals(category)) {
				listOfGames.add(game);
				System.out.println(listOfGames.get(i));
			}
			i++;
		}
		
		
	
		
		return listOfGames;
	}

	@Override
	public void updateGameById(Long id, Game game) {
		System.out.println(id);
		if (id != null) {
			game.setId(id);
			games.remove(id);
			games.put(id, game);
		}
		int x=4;
	}

	@Override
	public List<Character> mainCharactersPerGame(Long id) {
		List<Game> gameList = new ArrayList<>();
		for(Game game: games.values()) {
			gameList.add(game);
		}
		
		for(Game e : gameList) {
			System.out.println(e + "test");
		}
		
		return null;
	}

}
