package com.bellolucas.dslist.repositories;

import com.bellolucas.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
