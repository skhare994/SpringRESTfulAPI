package com.shashank.view;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.shashank.model.Products;
import java.util.List;


@FeignClient(
        value="ProductsView",
        url="${json.place.holder.base.url}"
)
public interface ProductsView {
    @GetMapping("todos")
    List<Products> getAllTodos();
    @GetMapping("todos/{number}")
    Products getSingleTodo(@PathVariable String number);
    @PostMapping("todos")
    Products createTodo(@RequestBody Products item);
}