package com.unicorn.model;

import static jakarta.persistence.GenerationType.AUTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Manga {

  @Id
  @GeneratedValue(strategy = AUTO)
  private long id;

  private String title;
  private String author;
  private double price;
}
