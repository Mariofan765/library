package com.mariofan765.tz.books;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class BooksService {

    private final BooksRepository repository;
    private final ModelMapper modelMapper;

    private Books toEntity(BooksDto dto) {
        return modelMapper.map(dto, Books.class);
    }

    private BooksDto toDto (Books entity) {
        return modelMapper.map(entity, BooksDto.class);
    }

    public List<BooksDto> getAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    public List<BooksDto> getAll(String bookTitle, String author) {
        return repository
                .findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    public Books getBook(String title) {
        return null;
    }

    public Books returnBook(String title) {
        return null;
    }

    public Books create(BooksDto booksDto) {
        return repository.save(toEntity(booksDto));
    }
}
