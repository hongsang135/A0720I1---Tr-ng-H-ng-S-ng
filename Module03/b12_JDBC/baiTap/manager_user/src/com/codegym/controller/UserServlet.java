package com.codegym.controller;

import com.codegym.dao.UserDAO;
import com.codegym.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    private UserDAO userDAO = new UserDAO();

    protected void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = new ArrayList<>();
        users = this.userDAO.selectAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("jsp/user/list.jsp").forward(request, response);
    }

    protected void viewUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.userDAO.selectUser(id);
        request.setAttribute("user", user);
        request.getRequestDispatcher("jsp/user/view.jsp").forward(request, response);
    }

    protected void viewFormEditUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.userDAO.selectUser(id);
        request.setAttribute("user", user);
        request.getRequestDispatcher("jsp/user/edit.jsp").forward(request, response);
    }

    protected void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        this.userDAO.updateUser(user);
        listUser(request, response);
    }

    protected void viewFormCreateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/user/create.jsp").forward(request, response);
    }

    protected void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        this.userDAO.insertUser(user);
        listUser(request, response);
    }

    protected void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.userDAO.deleteUser(id);
        listUser(request, response);
    }

    protected void viewFormSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/user/search.jsp").forward(request, response);
    }

    protected void searchUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String country = request.getParameter("country").trim();
        List<User> users = country == null ? this.userDAO.selectAllUsers() : this.userDAO.findUserByCountry(country);
        request.setAttribute("users", users);
        request.getRequestDispatcher("jsp/user/result.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    createUser(request, response);
                    break;
                case "edit":
                    editUser(request, response);
                    break;
                case "search":
                    searchUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create": {
                    viewFormCreateUser(request, response);
                    break;
                }
                case "edit": {
                    viewFormEditUser(request, response);
                    break;
                }
                case "delete": {
                    deleteUser(request, response);
                    break;
                }
                case "view": {
                    viewUser(request, response);
                    break;
                }
                case "search": {
                    viewFormSearch(request, response);
                    break;
                }
                default: {
                    listUser(request, response);
                    break;
                }

            }
        }catch (SQLException e){
            throw new ServletException(e);
        }

    }
}
