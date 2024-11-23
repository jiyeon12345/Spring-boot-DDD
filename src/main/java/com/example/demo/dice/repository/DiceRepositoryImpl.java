package com.example.demo.dice.repository;

import com.example.demo.dice.entity.Dice;
import org.springframework.stereotype.Repository;

@Repository
public class DiceRepositoryImpl implements DiceRepository {

    final int MIN = 1;
    final int MAX = 6;
    @Override
    public Dice rollDice() {
        int random = createRandomNumber();
        Dice dice = new Dice(random);

        return dice;
    }

    private int createRandomNumber() {
        return  (int) (Math.random() * MAX) + MIN;
    }
}
