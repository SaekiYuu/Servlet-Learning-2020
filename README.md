# Build and Deploy
- Run server on `localhost:8080/` by tomcat maven plugin 
```
git clone https://github.com/SaekiYuu/Servlet-Learning-2020 projectName
cd projectName
mvn compile
mvn tomcat7:run        
```
- You can modify the port in `pom.xml` `project.build.plugins.plugin.configuration.port`
- URL Available : 
    - Servlet
        - `/HelloWorld`
        - `/Cookie`
        - `/SessionTrack`
    - JSP Servlet (Of course JSP is a servlet. If you are confused about jsp, you should learn Servlet first.)
        - `/jsp-forward.jsp`
        - `/jsp-test.jsp`
        - `/jsp-calendar.jsp`
        - `/407page.jsp`
        - `/jsp-paramResolver.jsp`
        - `/redirect-to-index.jsp`
- Servlet URL is config by annotation `@WebServlet`
# Feature
- HelloWorld Server
- Cookie-Test
- SessionTrack
    - Generate session or get existing session.
    - Print some infomation on the server console once a visit happens.
- `jsp-test.jsp`
    - JSP control flow
    - JSP Declaration and Expression
    - JSP-XML Element
    - JSP Hidden Object
- `jsp-calendar.jsp`
    - Auto refresh calendar in JSP
- `407page.jsp`
    - Return a 407 http status
- `jsp-paramResolver.jsp`
    - Show the parameter pairs and Method
- `redirect-to-index.jsp`
# TODO-LIST
- ~~Session Test~~
- More Test
- ...
