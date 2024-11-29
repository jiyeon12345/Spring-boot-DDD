package com.example.demo.player.entity;

import com.example.demo.dice.entity.Dice;
import lombok.Getter;

import java.util.List;

@Getter
public class Player {
    private int id;
    private String nickname;
    private List<Dice> diceList;


    public Player(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public void SetDiceList(List<Dice> diceList) {
        this.diceList = diceList;
    }

}
