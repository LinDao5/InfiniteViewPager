package com.rim.infiniteviewpager.model;

public class Movie {
    private String name, description;
    private int page;

    public Movie() {
    }

    public Movie(String name, String description, int page) {
        this.name = name;
        this.description = description;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
