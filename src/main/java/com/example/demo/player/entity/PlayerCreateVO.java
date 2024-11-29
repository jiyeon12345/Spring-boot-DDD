package com.example.demo.player.entity;

import lombok.Getter;

@Getter
public class PlayerCreateVO {
    private String nickname;
    private boolean success;

    public PlayerCreateVO(String nickname, boolean success) {
        this.nickname = nickname;
        this.success = success;
    }
}
