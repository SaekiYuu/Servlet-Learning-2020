<%@ page language="java" contentType="text/html;charset=UTF-8"
        pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Counter</title>
    </head>
    <body>
        <h2>Session Counter</h2>
        <p>the session will be destroyed in 20s</p>
        <ul>
            <li>id : <%= session.getId() %></li>
            <%
            if (session.getAttribute("count") == null)
                session.setAttribute("count", new Integer(0));
            session.setAttribute("count", (Integer)session.getAttribute("count") + 1);
            session.setMaxInactiveInterval(20);
            %>
            <li>count : <%= session.getAttribute("count") %></li>
        </ul>
    </body>
</html>