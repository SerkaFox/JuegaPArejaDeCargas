package com.juegobase.juegodeparejacartasdemo.repository;

import com.juegobase.juegodeparejacartasdemo.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
