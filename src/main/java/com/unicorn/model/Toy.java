package com.unicorn.model;

import static jakarta.persistence.GenerationType.AUTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Toy {
  @Id
  @GeneratedValue(strategy = AUTO)
  private long id;

  private String name;
  private String brand;
  private double price;
}
