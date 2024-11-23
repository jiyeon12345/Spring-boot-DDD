package com.example.demo.player.repository;

import com.example.demo.player.entity.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository{
    static List<Player> playerList = new ArrayList<>();
    final String playerName = "player";
    int playerCount = 0;

    @Override
    public Player create() {
        Player player = new Player(playerName +"-"+ playerCount++);
        playerList.add(player);

        return player;
    }
}
