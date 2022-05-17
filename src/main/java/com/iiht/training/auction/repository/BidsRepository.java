package com.iiht.training.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.training.auction.entity.BidsEntity;

public interface BidsRepository extends JpaRepository<BidsEntity, Long> {

}
