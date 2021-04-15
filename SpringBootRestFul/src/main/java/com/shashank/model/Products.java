package com.shashank.model;

import lombok.Data;
@Data
public class Products {
    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;
}