package com.cgi.service;



import java.util.List;

import com.cgi.Domain.Category;
import com.cgi.Domain.Product;
import com.cgi.Domain.ProductJoin;
import com.cgi.repository.CategoryRepository;
import com.cgi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.smartcardio.CardTerminal;


@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Override
    public List<ProductJoin> join() {
        return productRepository.join();
    }

    @Override
    public Category save(Category category) {
        Category savedCategory = categoryRepository.save(category);
        return savedCategory;

    }
    @Override
    public Product saveproduct(Product product) {
        Product savedCategory = productRepository.save(product);
        return savedCategory;

    }

//    @Override
//    public ProductJoin getById(ProductJoin productJoin) {
//        ProductJoin productJoin1 = productRepository
//    }
}