package com.bricktobrick.B2BConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bricktobrick.B2BConnect.entity.Deals;

@Repository
public interface DealsRepository extends PagingAndSortingRepository<Deals, Long>, JpaRepository<Deals, Long> {

}
