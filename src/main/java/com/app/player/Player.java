package com.app.player;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Player implements PlayerDAO {

    @Override
    public List<Player> getAllPlayers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Player getPlayer(int playerID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updatePlayer(Player player) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteplayert(Player player) {
        // TODO Auto-generated method stub

    }

    @RequestMapping("/playerCreate")
    @Override
    public String createPlayer(Player player) {
        return "Hi, you created a player";
    }



}