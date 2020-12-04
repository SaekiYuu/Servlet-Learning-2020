<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%! int intValue = 114514; %>
<%! String stringValue = "1145141919"; %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>JSP Learning Home Page</title>
    </head>
    <body>
        <h2>include date.jsp Sample</h2>
        <jsp:include page="date.jsp" flush="true" />
        <h2>Declaration and Expression Sample</h2>
        <ul>
            <li>intValue = <%= intValue%></li>
            <li>
                stringValue = 
                <jsp:expression>stringValue</jsp:expression>
            </li>
            <li>
                stringValue.length() = 
                <jsp:expression>stringValue.length()</jsp:expression>
            </li>
            <li>
                stringValue.getClass = 
                <%= stringValue.getClass()%>
            </li>
        </ul>
        <h2>Comment Sample</h2>
        <p>type f12 to view the html comment behind element p</p>
        <!-- html comment -->
        <p>there is a jsp comment behind this element, but it's unvisible in client</p>
        <%-- jsp comment --%>
        <h2>IF-ELSE Sample</h2>
        <%! int day = 3;%>
        <p>
            declare day = <%= day%>. Is the day a weekend?
            <%
            if (day == 6 || day == 7)
                out.print("Yes");
            else
                out.print("No");
            %>
        </p>
        <p>
            <% if (false) {%>
                false is true!
            <%} else {%>
                false is false!
            <%}%>
        </p>
        <h2>Loop Sample</h2>
        <ul>
            <% for (int i = 0; i < 6; i++) { %>
                <li><font color="green" size="<%= i + 1%>">
                    <%= i%> sheep
                </font></li>
            <% } %>
        </ul>
        <h2>Element Sample</h2>
        <jsp:element name="p">
            <jsp:body>
            <jsp:element name="font">
                <jsp:attribute name="color">red</jsp:attribute>
                <jsp:attribute name="size">5</jsp:attribute>
                <jsp:attribute name="style">font-weight:bolder</jsp:attribute>
                <jsp:body>JSP-XML</jsp:body>
            </jsp:element>
            </jsp:body>
        </jsp:element>
        <h2>JSP Hidden Objects</h2>
        <ul>
            <li>request = <%= request.toString()%></li>
            <li>response = <%= response.toString()%></li>
            <li>out = <%= out.toString()%></li>
            <li>session = <%= session.toString()%></li>
            <li>application = <%= application.toString()%></li>
            <li>config = <%= config.toString()%></li>
            <li>config.getServletName() = <%= config.getServletName()%></li>
            <li>pageContext = <%= pageContext.toString()%></li>
            <li>page = <%= page.toString()%></li>
            <li>this = <%= this%></li>
            <li><%--<%= exception.toString()%>--%></li>
        </ul>
    </body>
</html>