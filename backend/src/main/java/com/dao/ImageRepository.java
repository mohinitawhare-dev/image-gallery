package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Image;

public interface ImageRepository extends JpaRepository<Image,Long> {

}
