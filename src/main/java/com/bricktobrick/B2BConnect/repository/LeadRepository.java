package com.bricktobrick.B2BConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bricktobrick.B2BConnect.entity.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
