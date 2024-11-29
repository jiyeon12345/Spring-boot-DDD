package com.example.demo.player.repository;

import com.example.demo.player.entity.Player;
import com.example.demo.player.entity.PlayerCreateVO;

import java.util.List;

public interface PlayerRepository {
    PlayerCreateVO create(String name);

    List<Player> getPlayerList();
}
