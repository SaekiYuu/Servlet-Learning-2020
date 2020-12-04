<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Resolve Parameters</title>
    </head>
    <body>
        <% if (request.getMethod().equals("GET")) { %>
            <h2>GET Sample</h2>
        <% } else if (request.getMethod().equals("POST")) { %>
            <% request.setCharacterEncoding("UTF-8"); %>
            <h2>Post Sample</h2>
        <% } else { %>
            <h2><%= request.getMethod() %> Sample</h2>
        <% } %>
        <ul>
            <% for (Map.Entry<String, String[]> pair 
                    : request.getParameterMap().entrySet()) { %>
                <li>
                    Key = <%= pair.getKey() %>,
                    Value = <%= pair.getValue()[0] %>
                </li>
            <% } %>
        </ul>
    </body>
</html>