package com.example.securityapp.controller;

import com.example.securityapp.entity.Cigar;
import com.example.securityapp.service.CigarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CigarController {

    private CigarService cigarService;

    @Autowired
    public CigarController(CigarService cigarService) {
        this.cigarService = cigarService;
    }

    // Postman
//    @GetMapping("/all")
//    public List<Cigar> getAllCigars() {
//        return cigarService.getAllCigars();
//    }
//
//    // Homepage
//    @GetMapping("/")
//    public String index(Model model) {
//        List<Cigar> cigarsList = cigarService.getAllCigars();
//        model.addAttribute("cigar", cigarsList);
//        return "registration";
//    }
//
//    @PreAuthorize("hasRole('ADMIN')")
//    @GetMapping("/admin")
//    public String adminPage(Model model) {
//        model.addAttribute("pageTitle", "Admin Page");
//        return "admin";
//    }
//
//    @PreAuthorize("hasRole('USER')")
//    @GetMapping("/user")
//    public String userPage(Model model) {
//        model.addAttribute("pageTitle", "User Page");
//        // Add additional attributes as needed
//        return "user";
//    }
}
