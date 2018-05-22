package com.hcmus.fetel.nhnhan.musicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String homePage() {
        return "home";
    }
    
    @RequestMapping(value = "albums")
    public String allAlbum() {
        return "album/albumList";
    }
}
