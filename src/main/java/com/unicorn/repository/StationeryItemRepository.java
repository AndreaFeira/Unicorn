package com.unicorn.repository;

import com.unicorn.model.StationeryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationeryItemRepository extends JpaRepository<StationeryItem, Long> {}
