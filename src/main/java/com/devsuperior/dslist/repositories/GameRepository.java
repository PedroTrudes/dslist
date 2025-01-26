package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Um projeto orientado a dominios por isso o nome vem representado a class:"Game" e o moledo: "Repository"
//passamos como "parametro" do JpaRepository a <Class = game, tipo do ID = private Long id>
public interface GameRepository extends JpaRepository<Game, Long> {

}
