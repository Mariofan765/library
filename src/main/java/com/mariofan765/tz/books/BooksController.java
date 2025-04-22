package com.mariofan765.tz.books;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BooksController {

    private final BooksService booksService;


    @GetMapping
    public ResponseEntity<List<BooksDto>> getAll(String bookTitle, String author) {
        return ResponseEntity.ok(booksService.getAll(bookTitle, author));
    }

    @PostMapping
    public ResponseEntity<Books> create(@RequestBody BooksDto booksDto) {
        return ResponseEntity.ok(booksService.create(booksDto));
    }




}
