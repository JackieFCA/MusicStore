package com.hcmus.fetel.nhnhan.musicstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcmus.fetel.nhnhan.musicstore.dao.AlbumDAO;
import com.hcmus.fetel.nhnhan.musicstore.model.Album;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDAO albumDAO;
    
    @Override
    public void createAlbum(Album album) {
        albumDAO.createAlbum(album);
    }

    @Override
    public Album updateAlbum(Album album) {
        return albumDAO.updateAlbum(album);
    }

    @Override
    public void deleteAlbum(int id) {
        albumDAO.deleteAlbum(id);
    }

    @Override
    public Album getAlbumById(int id) {
        return albumDAO.getAlbumById(id);
    }

    @Override
    public List<Album> getAlbums() {
        return albumDAO.getAlbums();
    }

}
