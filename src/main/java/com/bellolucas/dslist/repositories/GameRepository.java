package com.bellolucas.dslist.repositories;

import com.bellolucas.dslist.dto.GameDTO;
import com.bellolucas.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    Game findGameById(Long id);
}
