package com.example.demo.player.service;

import com.example.demo.player.entity.Player;
import com.example.demo.player.entity.PlayerCreateVO;

import java.util.List;

public interface PlayerService {
    PlayerCreateVO createPlayer(String name);
    List<Player> findPlayerList();
}
