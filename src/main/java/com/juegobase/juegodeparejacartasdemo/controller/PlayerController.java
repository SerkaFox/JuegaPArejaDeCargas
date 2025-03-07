package com.juegobase.juegodeparejacartasdemo.controller;

import com.juegobase.juegodeparejacartasdemo.model.Player;
import com.juegobase.juegodeparejacartasdemo.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping
    public Player addPlayer(@RequestParam String name) {
        return playerService.addPlayer(name);
    }
}
