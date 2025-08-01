package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("message", "Hello, World from Servlet!");
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
