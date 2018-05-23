package com.hcmus.fetel.nhnhan.musicstore.service;

import java.util.List;

import com.hcmus.fetel.nhnhan.musicstore.model.Album;

public interface AlbumService {
    
    public void createAlbum(Album album);

    public Album updateAlbum(Album album);

    public void deleteAlbum(int id);

    public Album getAlbumById(int id);

    public List<Album> getAlbums();
}
