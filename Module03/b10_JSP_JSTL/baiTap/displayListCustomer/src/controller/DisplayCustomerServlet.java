package controller;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "DisplayCustomerServlet", urlPatterns = "/customer")
public class DisplayCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer("Phat", "12/12/2012", "Da Nang", "img/phat.jpg"));
        listCustomer.add(new Customer("Nam", "12/12/2012", "Da Nang", "img/nam.jpg"));
        listCustomer.add(new Customer("Viet", "12/12/2012", "Da Nang", "img/viet.jpg"));
        listCustomer.add(new Customer("Dat", "12/12/2012", "Da Nang", "img/dat.jpg"));

        request.setAttribute("customerList", listCustomer);
        request.getRequestDispatcher("jsp/customer.jsp").forward(request, response);
    }
}
