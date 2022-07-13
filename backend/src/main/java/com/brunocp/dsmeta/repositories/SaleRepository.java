package com.brunocp.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocp.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	
}
