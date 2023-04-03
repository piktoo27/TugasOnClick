package com.example.tugasonclick;

public class user {
    private String name;
    private String instagram;
    int image;

    public user(String name, String instagram, int image) {
        this.name = name;
        this.instagram = instagram;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
