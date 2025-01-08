

package com.example.dbtable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @Column(name = "id", updatable = false, insertable = false)
    private Integer id;

    @Column(name = "title", updatable = false, insertable = false)
    private String title;

    @Column(name = "description", updatable = false, insertable = false)
    private String description;

    @Column(name = "year", updatable = false, insertable = false)
    private Integer year;

    // Getters only, no setters to ensure read-only access
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getYear() {
        return year;
    }
}