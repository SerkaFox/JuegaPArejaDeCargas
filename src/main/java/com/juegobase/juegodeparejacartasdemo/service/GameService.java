package com.juegobase.juegodeparejacartasdemo.service;

import com.juegobase.juegodeparejacartasdemo.model.Game;
import com.juegobase.juegodeparejacartasdemo.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game createNewGame() {
        Game game = new Game();
        game.setActive(true);
        return gameRepository.save(game);
    }
}
