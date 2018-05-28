package com.hcmus.fetel.nhnhan.musicstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcmus.fetel.nhnhan.musicstore.model.Album;
import com.hcmus.fetel.nhnhan.musicstore.service.AlbumService;

@Controller
public class MainController {
    
    @Autowired
    private AlbumService albumService;

    @RequestMapping(value = "/")
    public String homePage() {
        return "home";
    }
    
    @RequestMapping(value = "albums")
    public ModelAndView allAlbum(ModelAndView mav) {
        List<Album> listAlbum = albumService.getAlbums();
        mav.addObject("listAlbums", listAlbum);
        mav.setViewName("album/albumList");
        return mav;
    }
    
    @RequestMapping(value = "/newAlbum", method = RequestMethod.GET)
    public ModelAndView newAlbum(ModelAndView model) {
        Album album = new Album("album", 1);
        model.addObject("album", album);
        model.setViewName("album/album");
        return model;
    }
    
    @RequestMapping(value = "/saveAlbum", method = RequestMethod.POST)
    public String saveAlbum(@ModelAttribute Album album) {
        if (album.getId() == 0) {
            albumService.createAlbum(album);
        } else {
            albumService.updateAlbum(album);
        }
        return "redirect:/albums";
    }
}
