package com.example.demo.dice.service;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.repository.DiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DiceServiceImpl implements DiceService {
    final public DiceRepository diceRepository;
    @Override
    public Dice rollDice() {
        return diceRepository.rollDice();
    }
}
