package com.cgi.service;

import com.cgi.Domain.Category;
import com.cgi.Domain.Product;
import com.cgi.Domain.ProductJoin;

import java.util.List;


public interface ProductService {

    public List<ProductJoin> join();
    public Category save(Category category);
    public Product saveproduct(Product product);
//    ProductJoin getById(ProductJoin productJoin);

}