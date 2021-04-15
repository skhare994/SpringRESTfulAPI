package com.shashank.controller;

import com.shashank.model.Products;
import com.shashank.service.ProductServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("todo-list")
@RequiredArgsConstructor
public class ProductController {
    private ProductServices todoService;

    @GetMapping("")
    public List<Products> getAllTodos(){
        return todoService.getAllTodos();
    }
    @GetMapping("{number}")
    public Products getSingleTodo(@PathVariable String number){
        return todoService.getSingleTodo(number);
    }
    @PostMapping("")
    public Products createTodo(@RequestBody Products item){
        return todoService.createTodo(item);
    }
}
