package services;

import model.Product;

import java.util.List;

public interface ProductServices {
    List<Product> findAll();

    Product findId(int id);

    List<Product> findByName(String name);

    void remove(int id);

    void edit(int id, Product product);

    void save(Product product);
}
