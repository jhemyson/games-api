package com.ecommerce.games.games.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "PRODUCT_CATEGORY",
                joinColumns = @JoinColumn (name = "product_id"),
                inverseJoinColumns = @JoinColumn (name = "category_id"))
    List<Category> category;

    private String description;
    private Date release_date;
    private Rating rating;
    private int quantity;
    private boolean disable;
    private float price;

    public Product() {
    }

    public Product(Long id, String description,
                   List<Category> category, Date release_date,
                   Rating rating, int quantity,
                   boolean disable, float price) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.release_date = release_date;
        this.rating = rating;
        this.quantity = quantity;
        this.disable = disable;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
