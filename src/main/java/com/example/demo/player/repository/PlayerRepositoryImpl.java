package com.example.demo.player.repository;

import com.example.demo.player.entity.Player;
import com.example.demo.player.entity.PlayerCreateVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository{
    static List<Player> playerList = new ArrayList<>();
    final String playerName = "player";
    int playerCount = 1;

    @Override
    public PlayerCreateVO create(String nickname) {
        Player player = new Player(playerCount++, nickname);
        playerList.add(player);

        return new PlayerCreateVO(nickname, true);
    }
}
