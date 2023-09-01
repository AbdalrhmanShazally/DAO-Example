package com.revature;

import com.dao.ConnectionUtility;
import com.dao.ProductDAO;
import com.dao.ProductDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            System.out.println(ConnectionUtility.getConnection().isValid(5));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        List<Products> product = new ArrayList<>();
        ProductDAOImpl pdao = new ProductDAOImpl();

        product = pdao.getProducts();
        System.out.println("current list of products are:");
        System.out.println("ID "+ " | " + " Name: "+"   |  "+ " Desc: ");
        for (Products p:product) {
            System.out.println(p.getId() + "    |  " + p.getName()+ "   |   "  +  p.getDescription());
            System.out.println("-----------------------------------------------");
        }


    }
}
