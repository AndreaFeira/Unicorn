package com.unicorn.model;

import static jakarta.persistence.GenerationType.AUTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StationeryItem {

  @Id
  @GeneratedValue(strategy = AUTO)
  private long id;

  private String name;
  private double price;
}
