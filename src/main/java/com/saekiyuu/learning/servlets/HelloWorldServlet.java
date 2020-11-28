package com.saekiyuu.learning.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorldServlet", urlPatterns = { "/HelloWorld" })
public class HelloWorldServlet extends HttpServlet {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = resp.getWriter();
        
        pw.print("<center><h1>Hello, World from Remote!!</h1></center>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
