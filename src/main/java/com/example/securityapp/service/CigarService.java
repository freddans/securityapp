package com.example.securityapp.service;

import com.example.securityapp.entity.Cigar;
import com.example.securityapp.repo.CigarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CigarService {

    private CigarRepo cigarRepo;

    @Autowired
    public CigarService(CigarRepo cigarRepo) {
        this.cigarRepo = cigarRepo;
    }

    public List<Cigar> getAllCigars() {
        List<Cigar> allCigars = new ArrayList<>();

        for (Cigar cigar : cigarRepo.findAll()) {
            allCigars.add(cigar);
        }

        return allCigars;
    }
}
