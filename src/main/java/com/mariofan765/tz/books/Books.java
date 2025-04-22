package com.mariofan765.tz.books;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Books {

    @Id
    private Long id;

    @Basic
    @Column(name = "title")
    String title;

    @Basic
    @Column(name = "author")
    String author;

    @Basic
    @Column(name = "author_full_name")
    String authorFullName;

}
