package com.shashank.service;

import com.shashank.model.Products;
import com.shashank.view.ProductsView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List
;
@Slf4j
@Service
public class ProductServices{
    @Autowired
    public ProductsView jsonPlaceHolderClient;
    public List<Products> getAllTodos(){
//        log.info("fetching all todo items");
        return jsonPlaceHolderClient.getAllTodos();
    }
    public Products getSingleTodo(String number){
//        log.info("fetching todo item {}", number);
        return jsonPlaceHolderClient.getSingleTodo(number);
    }
    public Products createTodo(Products item){
//        log.info("creating todo item {}", item);
        return jsonPlaceHolderClient.createTodo(item);
    }
}