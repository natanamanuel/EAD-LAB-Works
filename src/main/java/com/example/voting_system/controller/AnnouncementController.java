package com.example.voting_system.controller;

import com.example.voting_system.model.Announcement;
import com.example.voting_system.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/announcements")
public class AnnouncementController {

    private final AnnouncementService announcementService;

    @Autowired
    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping("/admin")
    public String showCreateAnnouncementPage() {
        return "create_announcement";
    }
    
    @PostMapping("/create")
    public String createAnnouncement(@RequestParam String title, @RequestParam String content) {
        Announcement announcement = new Announcement();
        announcement.setTitle(title);
        announcement.setContent(content);
        announcementService.createAnnouncement(announcement);
        return "redirect:/announcements/admin/view";
    }

    @GetMapping("/view")
    public String viewAnnouncements(Model model) {
        List<Announcement> announcements = announcementService.getAllAnnouncements();
        model.addAttribute("announcements", announcements);
        return "view_announcements";
    }
    
    @GetMapping("/admin/view")
    public String viewAdminAnnouncements(Model model) {
        List<Announcement> announcements = announcementService.getAllAnnouncements();
        model.addAttribute("announcements", announcements);
        return "view_admin_announce";
    }
    
    @PostMapping("/admin/update")
    public String updateAnnouncement(@RequestParam Long announcementId, @RequestParam String title, @RequestParam String content) {
    	announcementService.updateAnnouncement(announcementId, title, content);
        return "redirect:/announcements/admin/view";
    }
    
    @PostMapping("/admin/delete/{announcementId}")
    public String deleteAnnouncement(@PathVariable Long announcementId) {
    	announcementService.deleteAnnouncement(announcementId);
        return "redirect:/announcements/admin/view";
    }
}
