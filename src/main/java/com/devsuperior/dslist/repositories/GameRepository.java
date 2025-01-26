package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Um projeto orientado a dominios por isso o nome vem representado a class:"Game" e o moledo: "Repository"
//passamos como "parametro" do JpaRepository a <Class = game, tipo do ID = private Long id>
public interface GameRepository extends JpaRepository<Game, Long> {
    //Colocamos na @Query a opção de nativeQuery = true para ele enteder que vamos usar Codigos SQL e não JPQL
    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    //vamos chamar o metodo SearchByList no Service, quando for fazer o teste no banco
    //colocar um id valido no :listId ex: 1 pois no SQL ele não pega esse valor de parametro como estamos pasando no SearchByList(id)
    List<GameMinProjection> searchByList(Long listId);
}
