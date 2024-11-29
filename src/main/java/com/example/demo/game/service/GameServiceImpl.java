package com.example.demo.game.service;

import com.example.demo.game.entity.GamePlayVO;
import com.example.demo.game.repository.GameRepository;
import com.example.demo.player.entity.Player;
import com.example.demo.player.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService{

    final private GameRepository gameRepository;

    @Override
    public GamePlayVO createGame() {

        return gameRepository.createGame();
    }
}
