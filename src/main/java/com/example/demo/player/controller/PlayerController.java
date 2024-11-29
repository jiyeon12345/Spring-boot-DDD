package com.example.demo.player.controller;

import com.example.demo.player.entity.Player;
import com.example.demo.player.entity.PlayerCreateVO;
import com.example.demo.player.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {
    final private PlayerService playerService;

    @GetMapping("/create-player")
    public PlayerCreateVO create(@RequestParam("name") String name) {
        log.info("create player called, name is " + name);
        return playerService.createPlayer(name);
    }
}
