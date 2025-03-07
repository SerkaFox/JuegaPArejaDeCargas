package com.juegobase.juegodeparejacartasdemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int positionX;
    private int positionY;
    private String value; // Например, "A", "B", "C" (пара карт будет иметь одинаковое значение)
    private boolean isMatched;
}

