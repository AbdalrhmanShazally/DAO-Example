package com.dao;

import com.revature.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements  ProductDAO{
    @Override
    public List<Products> getProducts() {
        List<Products> products = new ArrayList<>();
        try {
            Connection conn = ConnectionUtility.getConnection();
            String sql = "SELECT * FROM PRODUCTS";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                long id = rs.getLong(1);
                String name = rs.getString(2);
                String desc = rs.getString(3);

                Products p = new Products();
                p.setId(id);
                p.setName(name);
                p.setDescription(desc);

                products.add(p);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        return products;
    }

    @Override
    public void addProduct(Products product) {

    }

    @Override
    public void deleteProduct(Products product) {

    }

    @Override
    public void updateProduct(Products product) {

    }
}
