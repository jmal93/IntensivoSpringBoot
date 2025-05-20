package com.jota.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jota.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
