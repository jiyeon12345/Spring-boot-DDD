package com.example.demo.player.service;

import com.example.demo.player.entity.Player;
import com.example.demo.player.entity.PlayerCreateVO;

public interface PlayerService {
    PlayerCreateVO createPlayer(String name);
}
