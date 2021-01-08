package controller;

import model.Product;
import services.ProductServiceIplm;
import services.ProductServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductServices productServices = new ProductServiceIplm();

    protected void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = this.productServices.findAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("jsp/product/list.jsp").forward(request, response);
    }

    protected void viewFormAddProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/product/create.jsp").forward(request, response);
    }

    protected void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int inventory = Integer.parseInt(request.getParameter("inventory"));
        int sold = Integer.parseInt(request.getParameter("sold"));
        Product product = new Product(id, name, inventory, sold);
        this.productServices.save(product);
        listProduct(request, response);
    }

    protected void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productServices.findId(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("jsp/product/view.jsp").forward(request, response);
    }

    protected void viewFormEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productServices.findId(id);
        request.setAttribute("product", product);
        request.getRequestDispatcher("jsp/product/edit.jsp").forward(request, response);
    }

    protected void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int inventory = Integer.parseInt(request.getParameter("inventory"));
        int sold = Integer.parseInt(request.getParameter("sold"));
        Product product = new Product(id, name, inventory, sold);
        this.productServices.edit(id, product);
        listProduct(request, response);
    }

    protected void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.productServices.remove(id);
        listProduct(request, response);
    }

    protected void viewFormSearchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/product/search.jsp").forward(request, response);
    }

    protected void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        List<Product> products = name == null ? this.productServices.findAll() : this.productServices.findByName(name);
        request.setAttribute("products" , products);
        request.getRequestDispatcher("jsp/product/result.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add": {
                addProduct(request, response);
                break;
            }
            case "edit": {
                editProduct(request, response);
                break;
            }
            case "search": {
                searchProduct(request, response);
                break;
            }
            default: {
                listProduct(request, response);
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
            case "add": {
                viewFormAddProduct(request, response);
                break;
            }
            case "view": {
                viewProduct(request, response);
                break;
            }
            case "edit": {
                viewFormEditProduct(request, response);
                break;
            }
            case "delete": {
                deleteProduct(request, response);
                break;
            }
            case "search": {
                viewFormSearchProduct(request, response);
                break;
            }
            default: {
                listProduct(request, response);
                break;
            }

        }
    }
}
