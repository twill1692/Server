package com.app.player;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<PlayerEntity, Long> {

}