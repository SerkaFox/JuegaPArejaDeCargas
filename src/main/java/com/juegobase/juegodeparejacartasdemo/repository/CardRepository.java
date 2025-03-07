package com.juegobase.juegodeparejacartasdemo.repository;

import com.juegobase.juegodeparejacartasdemo.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
