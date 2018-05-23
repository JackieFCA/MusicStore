package com.hcmus.fetel.nhnhan.musicstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcmus.fetel.nhnhan.musicstore.model.Album;

@Repository
public class AlbumDAOImpl implements AlbumDAO {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void createAlbum(Album album) {
        getCurrentSession().saveOrUpdate(album);
    }

    @Override
    public Album updateAlbum(Album album) {
        getCurrentSession().update(album);
        return album;
    }

    @Override
    public void deleteAlbum(int id) {
        Album album = (Album) getCurrentSession().load(Album.class, id);
        if (album != null) {
            getCurrentSession().delete(album);
        }
    }

    @Override
    public Album getAlbumById(int id) {
        return (Album) getCurrentSession().get(Album.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Album> getAlbums() {
        return getCurrentSession().createQuery("from Album").list();
    }
    
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
