package services;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductServiceIplm implements ProductServices {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "SamSung", 10000, 8500));
        products.put(2, new Product(2, "Iphone", 50000, 9500));
        products.put(3, new Product(3, "VinSmart", 1000000, 90000));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findId(int id) {
        return products.get(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return products.values().stream().filter(cus -> cus.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void edit(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }
}
