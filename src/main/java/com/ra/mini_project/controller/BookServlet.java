package com.ra.mini_project.controller;

import com.ra.mini_project.model.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "bookServlet", value = "/bookServlet")
public class BookServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		switch (action) {
			case "add":
				List<Category> categories = new ArrayList<>();
				categories.add(new Category(1, "Cà Phê", true));
				categories.add(new Category(2, "Nước ngọt", true));
				categories.add(new Category(3, "Bánh ngọt", true));
				req.setAttribute("categories", categories);
				req.getRequestDispatcher("/views/addBook.jsp").forward(req, resp);
				break;
			default:
				break;
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
