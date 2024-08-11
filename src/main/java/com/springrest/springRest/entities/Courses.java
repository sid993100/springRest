package com.springrest.springRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Courses {
    @Id
    private long id;
    private String title;
    private String description;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Courses(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Courses(){
        super();
    }


}
