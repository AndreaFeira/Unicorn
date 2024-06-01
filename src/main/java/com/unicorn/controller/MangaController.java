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
    return repository.findById(id).orElseThrow(() -> new RuntimeException("Manga not found"));
  }

  @PostMapping
  public Manga saveManga(@RequestBody Manga manga) {
    return repository.save(manga);
  }

  @PutMapping
  public Manga updateManga(Manga manga) {

    Manga find =
        repository
            .findById(manga.getId())
            .orElseThrow(() -> new RuntimeException("Manga not found"));
    find.setAuthor(manga.getAuthor());
    find.setPrice(manga.getPrice());
    find.setTitle(manga.getTitle());

    return repository.save(find);
  }

  @DeleteMapping
  public void deleteMangaById(@PathVariable long id) {

    Manga manga =
        repository.findById(id).orElseThrow(() -> new RuntimeException("Manga not found"));
    repository.delete(manga);
  }
}
