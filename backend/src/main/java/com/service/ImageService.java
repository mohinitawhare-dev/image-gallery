package com.service;


import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.model.Image;


public interface ImageService {
	
	public Image addImage(MultipartFile file);
	
	public List<Image> getAllImage();
	
	public Optional<Image> getOneImage(Long id);
	
	public void deleteImageFile(Long fileId);
	
	
}
