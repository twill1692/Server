//The interface which will be used by PlayerEntity class and the PlayerController class. 
package com.app.player;

import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface PlayerDAO {
    public List<Player> getAllPlayers();

    public Player getPlayer(int playerID);

    @RequestMapping("/playerCreate")
    public String createPlayer(Player player);
    
    public void updatePlayer(Player player);

    public void deleteplayert(Player player);
}