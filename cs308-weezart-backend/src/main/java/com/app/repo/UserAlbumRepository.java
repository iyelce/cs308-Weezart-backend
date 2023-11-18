package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.models.Album;
import com.app.models.User;
import com.app.models.UserAlbum;

@Repository
public interface UserAlbumRepository extends JpaRepository<UserAlbum, Long>{
	UserAlbum findByAlbumAndUser(Album album, User user);
}