package com.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dao.ImageRepository;
import com.model.Image;


@Service
public class ImageServiceImpl implements ImageService  {
	
	@Autowired
	private ImageRepository imageRepo;
	
	@Override
	public Image addImage(MultipartFile file) {

	    Image img = new Image(); 

	    String newFileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();

	    img.setName(newFileName);

	    try {
	        img.setImageData(file.getBytes());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return imageRepo.save(img);
	}

	@Override
	public List<Image> getAllImage() {
		
		return imageRepo.findAll();
		}

	@Override
	public Optional<Image> getOneImage(Long id) {
		
		Optional<Image> img= imageRepo.findById(id);
		return img;
	}
	
	@Override
	public void deleteImageFile(Long fileId) {
	    imageRepo.deleteById(fileId);
	}
	
}
