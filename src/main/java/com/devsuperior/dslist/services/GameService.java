package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//preciso registrar esse Service como um componente do sistema usando anotation, caso contrario ele não identifica.

@Service
public class GameService {

    //injetando o componente de gameRepository
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll(); //o Var result é uma Lista<Game>
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();//Aqui estamos formantnado o formato da minha saida de REQ
        return dto;
    }
}
