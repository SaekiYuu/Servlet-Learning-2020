package com.saekiyuu.learning.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CookieServlet", urlPatterns = { "/Cookie" })
public class CookieServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 5579445688979751763L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String paramName = req.getParameter("name");
        String paramURL = req.getParameter("url");
        Map<String, Cookie> cookieMap = getCookieMap(req);
        String displayedName = "Default Name";
        String displayedURL = "Default URL, you asshole!";
        Cookie name = null;
        Cookie url = null;

        if (paramName != null && paramURL != null) {
            name = new Cookie("name",
                URLEncoder.encode(req.getParameter("name"), "UTF-8"));
            url = new Cookie("url", req.getParameter("url"));
        } else if (cookieMap != null) {
            name = cookieMap.get("name");
            url = cookieMap.get("url");
            System.out.println("Refreshing Cookies:");
            System.out.println("\tname : " + URLDecoder.decode(name.getValue(), "UTF-8"));
            System.out.println("\turl : " + url.getValue());
            System.out.println("\tname.maxAge : " + name.getMaxAge());
            System.out.println("\turl.maxAge : " + url.getMaxAge());
        }
        
        if (name != null && url != null) {
            displayedName = URLDecoder.decode(name.getValue(), "UTF-8");
            displayedURL = url.getValue();
            name.setMaxAge(60 * 60 * 24);
            url.setMaxAge(60 * 60 * 24);
            resp.addCookie(name);
            resp.addCookie(url);
            System.out.println("New Cookies:");
            System.out.println("\tname : " + URLDecoder.decode(name.getValue(), "UTF-8"));
            System.out.println("\turl : " + url.getValue());
            System.out.println("\tname.maxAge : " + name.getMaxAge());
            System.out.println("\turl.maxAge : " + url.getMaxAge());
        }
        
        PrintWriter out = resp.getWriter();
        String title = "Set Cookie Example";
        String docType = "<!DOCTYPE html>\n";
        out.println(
            docType + 
            "<html>\n" +
            "<head><title>" + title + "</title></head>" +
            "<body bgcolor=\"#F0F0F0\">\n" +
            "<h1 align=\"center\">" + title + "</h1>\n" +
            "<ul>\n" +
            "  <li><b>Name：</b>：" + 
                displayedName + "\n</li>" +
            "  <li><b>Site URL：</b>：" + 
                displayedURL + "\n</li>" +
            "</ul>\n" +
            "</body></html>\n"
        );
    }

    private static Map<String, Cookie> getCookieMap(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null)
            return null;
        HashMap<String, Cookie> map = new HashMap<>();
        for (Cookie cookie : cookies) {
            map.put(cookie.getName(), cookie);
        }
        return map;
    }
}
