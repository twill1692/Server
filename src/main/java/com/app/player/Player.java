package com.app.player;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Player {

@RequestMapping("/playerCreate")
public String createPlayer(){
    return "Created";  
}

}