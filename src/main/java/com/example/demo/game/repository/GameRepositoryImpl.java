package com.example.demo.game.repository;

import com.example.demo.dice.entity.Dice;
import com.example.demo.dice.service.DiceService;
import com.example.demo.game.entity.GamePlayVO;
import com.example.demo.player.entity.Player;
import com.example.demo.player.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class GameRepositoryImpl implements GameRepository{
    final private PlayerService playerService;
    final private DiceService diceService;

    int gameCount = 1;

    @Override
    public GamePlayVO createGame() {
        List<Player> playerList = playerService.findPlayerList();

        if(playerList == null && playerList.size() == 0) return null;

        int playCount = 3;
        for(Player player : playerList) {
            List<Dice> diceList = new ArrayList<>();

            int index = 0;
            while (index < playCount) {
                Dice dice = diceService.rollDice();
                diceList.add(dice);
                index++;
            }
            player.SetDiceList(diceList);
        }
        return new GamePlayVO(gameCount++, true);
    }
}
