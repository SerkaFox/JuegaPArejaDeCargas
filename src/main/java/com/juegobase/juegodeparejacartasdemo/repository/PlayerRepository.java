package com.juegobase.juegodeparejacartasdemo.repository;

import com.juegobase.juegodeparejacartasdemo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

// Интерфейс для работы с игроками
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
