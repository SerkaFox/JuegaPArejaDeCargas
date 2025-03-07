package com.juegobase.juegodeparejacartasdemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int score;
}

