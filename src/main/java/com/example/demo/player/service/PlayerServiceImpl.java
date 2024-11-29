package com.example.demo.player.service;

import com.example.demo.player.entity.Player;
import com.example.demo.player.entity.PlayerCreateVO;
import com.example.demo.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    final private PlayerRepository playerRepository;
    @Override
    public PlayerCreateVO createPlayer(String name) {
        return playerRepository.create(name);
    }

    @Override
    public List<Player> findPlayerList() {
        return playerRepository.getPlayerList();
    }
}
