package com.example.demo.dice.controller;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.service.DiceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/dice")
public class DiceController {

    final private DiceService divceService;

    @GetMapping("/test")
    public String diceTest() {
        log.info("diceTest");
        return "diceTest";
    }

    @GetMapping("/roll-dice")
    public Dice rollDive() {
        log.info("roll device called.");
        Dice acquiredDevice = divceService.rollDice();

        return acquiredDevice;
    }
}
