package com.dao;

import com.revature.Products;

import java.util.List;

public interface ProductDAO {
    List<Products> getProducts();

    void addProduct (Products product);
    void deleteProduct(Products product);
    void updateProduct(Products product);
}
