package com.example.addfragment;

public class coffee {
    private String name;
    private String description; //ingredients
    private String price;
    private String AddToList;

    public coffee(String name, String description, String price, String addToList) {
        this.name = name;
        this.description = description;
        this.price = price;
        AddToList = addToList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAddToList(String addToList) {
        AddToList = addToList;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getAddToList() {
        return AddToList;
    }

    @Override
    public String toString() {
        return "coffee{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", AddToList='" + AddToList + '\'' +
                '}';
    }
}
