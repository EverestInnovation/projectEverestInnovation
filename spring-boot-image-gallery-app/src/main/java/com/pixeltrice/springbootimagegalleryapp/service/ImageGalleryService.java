package com.pixeltrice.springbootimagegalleryapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pixeltrice.springbootimagegalleryapp.entity.ImageGallery;
import com.pixeltrice.springbootimagegalleryapp.repository.ImageGalleryRepository;

@Service
@Transactional
public class ImageGalleryService {

	@Autowired
	ImageGalleryRepository imageGalleryRepository;
	
	public void saveImage(ImageGallery imageGallery) {
		
		imageGalleryRepository.save(imageGallery);
	}
	
	public List<ImageGallery> getAllActiveImages(){
		
		return imageGalleryRepository.findAll();
	}
	
	public Optional<ImageGallery> getImageById(Long id){
		
		return imageGalleryRepository.findById(id);
	}
}
