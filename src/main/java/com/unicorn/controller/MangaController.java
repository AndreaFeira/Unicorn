package com.unicorn.controller;

import com.unicorn.model.Manga;
import com.unicorn.repository.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/manga")
public class MangaController {

  @Autowired public MangaRepository repository;

  @GetMapping
  public Manga getMangaById(@PathVariable long id) {
    return repository.findById(id).orElse(null);
  }

  @PutMapping
  public Manga saveManga(@RequestBody Manga manga) {
    return repository.save(manga);
  }

  // Dunno
  @PostMapping
  public Manga updateManga(Manga manga) {
    return repository.save(manga);
  }

  @DeleteMapping
  public void deleteMangaById(@PathVariable long id) {
    repository.deleteById(id);
  }
}
