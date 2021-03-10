package com.ecommerce.games.games.controllers.dto;

import com.ecommerce.games.games.entities.Category;
import com.ecommerce.games.games.entities.Rating;

import java.util.Date;
import java.util.List;

public class CreateProductDto {
    private String description;
    private Date release_date;
    private Rating rating;
    private int quantity;
    private boolean disable;
    private float price;
    List<Category> category = null;
}
