package com.bellolucas.dslist.controllers;

import com.bellolucas.dslist.dto.GameDTO;
import com.bellolucas.dslist.dto.GameMinDTO;
import com.bellolucas.dslist.entities.Game;
import com.bellolucas.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
       List<GameMinDTO> result = gameService.findAll();
       return result;
    }

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }
}
