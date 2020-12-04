<html>
    <head>
        <title>Setting HTTP Status Code</title>
    </head>
    <body>
        <%
        response.sendError(407, "Need authentication!!!" );
        %>
    </body>
</html>