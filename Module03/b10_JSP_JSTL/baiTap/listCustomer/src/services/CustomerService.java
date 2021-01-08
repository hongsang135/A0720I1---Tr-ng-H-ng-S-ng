package services;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public static List<Customer> listCustomer = new ArrayList<>();

    public List<Customer> getListCustomer() {
        return listCustomer;
    }

    public void addCustomer(Customer cus) {
        listCustomer.add(cus);
    }
    public boolean checkLogin(String username, String password) {
        if ("sang".equals(username) && "sang123".equals(password)) {
            return true;
        }
        return false;
    }
}
