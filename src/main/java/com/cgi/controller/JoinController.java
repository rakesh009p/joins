package com.cgi.controller;


import com.cgi.Domain.Category;
import com.cgi.Domain.Product;
import com.cgi.Domain.ProductJoin;
import com.cgi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.PreparedStatement;
import java.util.List;

@Controller
@RequestMapping("api/v1")
public class JoinController {
    ProductService productService;
    @Autowired
    public JoinController(ProductService productService){
        this.productService = productService;

    }
    @PostMapping("join")
    public ResponseEntity<?> saveCategory(Category category){
        Category saveCatagerory = productService.save(category);
        return new ResponseEntity<>(saveCatagerory, HttpStatus.CREATED);
    }
    @PostMapping("joinproduct")
    public ResponseEntity<?> saveProduct(Product product){
        Product saveCatagerory = productService.saveproduct(product);
        return new ResponseEntity<>(saveCatagerory, HttpStatus.CREATED);
    }
    @GetMapping("joinaaaa")
    public ResponseEntity<?> getById(ProductJoin id){
        List<ProductJoin> productJoin1 = productService.join();
        return new ResponseEntity<>(productJoin1, HttpStatus.CREATED);


    }

}
