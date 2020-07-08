package com.cgi.repository;

import java.util.List;

import com.cgi.Domain.Product;
import com.cgi.Domain.ProductJoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select new com.cgi.Domain.ProductJoin(p.id, p.name, p.price, p.category.id, p.category.name) from Product p, Category c where p.category = c")
    public List<ProductJoin> join();

}
