package com.example.demo.game.entity;

import lombok.Getter;

@Getter
public class GamePlayVO {
    private int gameId;
    private boolean success;

    public GamePlayVO(int gameId, boolean success) {
        this.gameId = gameId;
        this.success = success;
    }
}
