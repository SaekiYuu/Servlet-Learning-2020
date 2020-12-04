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
    - Auto refresh in JSP
# TODO-LIST
- ~~Session Test~~
- More Test
- ...
