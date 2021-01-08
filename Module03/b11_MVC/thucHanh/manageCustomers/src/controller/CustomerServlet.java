package controller;

import model.Customer;
import services.CustomerService;
import services.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();

    protected void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = this.customerService.findAll();
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("jsp/customer/list.jsp").forward(request, response);
    }

    protected void viewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findId(id);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/customer/view.jsp").forward(request, response);
    }

    protected void viewFormAddCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/customer/create.jsp").forward(request, response);
    }

    protected void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, name, email, address);
        this.customerService.save(customer);
        listCustomer(request, response);
    }

    protected void viewFormEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findId(id);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/customer/edit.jsp").forward(request, response);
    }

    protected void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, name, email, address);
        this.customerService.update(id, customer);
        listCustomer(request, response);
    }

    protected void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.customerService.remove(id);
        listCustomer(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                addCustomer(request, response);
                break;
            }
            case "edit": {
                editCustomer(request, response);
                break;
            }
            default: {
                listCustomer(request, response);
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                viewFormAddCustomer(request, response);
                break;
            }
            case "edit": {
                viewFormEditCustomer(request, response);
                break;
            }
            case "delete": {
                deleteCustomer(request, response);
                break;
            }
            case "view": {
                viewCustomer(request, response);
                break;
            }
            default: {
                listCustomer(request, response);
                break;
            }
        }

    }
}
