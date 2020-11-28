package com.saekiyuu.learning.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SessionTrackServlet", urlPatterns = { "/SessionTrack" })
public class SessionTrackServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = -6197618397750397333L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // if Session doesn't exist, getSession(true) will create a session rather than return null
        HttpSession session = req.getSession(true);
        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // is session new?
        if (session.isNew()) {
            session.setAttribute("userName", "user#" + session.getId());
            session.setAttribute("userId", session.getId());
            session.setAttribute("visitCount", 1);
        } else {
            session.setAttribute("visitCount", (Integer)session.getAttribute("visitCount") + 1);
        }
        // set response title
        resp.setContentType("text/html;charset=UTF-8");
        String title = "Session Servlet Test";
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>" + title + "</title></head>" + 
            "<body><center><h1>Check the result on Console</h1></center></body></html>"    
        );
        System.out.println("=".repeat(80));
        System.out.println("create time: " + dateFormat.format(createTime));
        System.out.println("last access time: " + dateFormat.format(lastAccessTime));
        System.out.println("user name: " + session.getAttribute("userName"));
        System.out.println("user id: " + session.getAttribute("userId"));
        System.out.println("visit count: " + session.getAttribute("visitCount"));
        System.out.println("=".repeat(80));
    }
}
