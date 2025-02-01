package com.example.voting_system.service;

import com.example.voting_system.model.Announcement;
import com.example.voting_system.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService {

    private final AnnouncementRepository announcementRepository;

    @Autowired
    public AnnouncementService(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    public void createAnnouncement(Announcement announcement) {
        announcementRepository.save(announcement);
    }

    public List<Announcement> getAllAnnouncements() {
        return announcementRepository.findAll();
    }
    
    
    public void updateAnnouncement(Long announcementId, String title, String content) {
    	Announcement announcement = announcementRepository.findById(announcementId)
                                   .orElseThrow(() -> new RuntimeException("announcement not found"));
    	announcement.setTitle(title);
    	announcement.setContent(content);
        announcementRepository.save(announcement);
    }
    
    public void deleteAnnouncement(Long id) {
    	announcementRepository.deleteById(id);
    }
}
