package com.codeclan.example.folderManagement.models;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extensions")
    private String extension;

    @Column(name = "size")
    private int size;

    @ManyToOne()
}
