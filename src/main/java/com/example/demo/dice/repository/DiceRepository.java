package com.example.demo.dice.repository;

import com.example.demo.dice.entity.Dice;
import org.springframework.stereotype.Repository;


public interface DiceRepository {
    Dice rollDice();
}
