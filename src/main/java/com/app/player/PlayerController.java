package com.app.player;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

@RequestMapping("/playerCreate")
public String createPlayer(){
    return "Created";  
}

}