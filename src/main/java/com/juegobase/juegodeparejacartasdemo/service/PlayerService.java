package com.juegobase.juegodeparejacartasdemo.service;

import com.juegobase.juegodeparejacartasdemo.model.Player;
import com.juegobase.juegodeparejacartasdemo.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player addPlayer(String name) {
        Player player = new Player();
        player.setName(name);
        player.setScore(0);
        return playerRepository.save(player);
    }
}
