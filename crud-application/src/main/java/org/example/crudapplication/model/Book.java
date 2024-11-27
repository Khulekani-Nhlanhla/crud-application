package org.example.crudapplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name = "title" , nullable = false)
    private String title;


}
