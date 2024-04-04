package com.example.securityapp.repo;

import com.example.securityapp.entity.Cigar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CigarRepo extends JpaRepository<Cigar, Long> {
}
