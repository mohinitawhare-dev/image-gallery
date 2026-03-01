package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.model.Image;
import com.service.ImageService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ImageController {
	
	@Autowired
	private ImageService imgService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addImage(@RequestParam("file") MultipartFile file) {
		
		Image img=imgService.addImage(file);
		
		return ResponseEntity.ok("image add"+img.getName());
			
	}
	
	@GetMapping("/getAll")
	
	public ResponseEntity<List<Image>> getImages() {
		
		List<Image> imgList= imgService.getAllImage();
		
		return ResponseEntity.status(HttpStatus.OK).body(imgList);
		
	}
	/*
	@GetMapping("/getOne/{id}")
	public ResponseEntity<Resource> getOneImage(@PathVariable Long id) {
		
		Optional<Image> img=imgService.getOneImage(id);
		
		Image image = img.get();
		
		return ResponseEntity.status(HttpStatus.OK)
		        .body(new ByteArrayResource(img.getData()));
	}
	*/
	


	@GetMapping("/getOne/{id}")
	public ResponseEntity<ByteArrayResource> getOneImage(@PathVariable Long id) {

	    Optional<Image> img = imgService.getOneImage(id);

	    if (img.isEmpty()) {
	        
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }

	    Image image = img.get(); 

	    return ResponseEntity.status(HttpStatus.OK)
	            .body(new ByteArrayResource(image.getImageData()));
	}
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteImageSafe(@PathVariable Long id) {
		
        imgService.deleteImageFile(id);
        
        return ResponseEntity.ok("Image deletion attempted for id: " + id);
    }
}