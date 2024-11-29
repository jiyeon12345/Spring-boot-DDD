package com.example.demo.dice.entity;

import lombok.Getter;

@Getter
public class Dice {
    private int id;
    private int number;

    public Dice(int id, int number) {
        this.id = id;
        this.number = number;
    }
}
