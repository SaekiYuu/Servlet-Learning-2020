# Build and Deploy
- Run server on `localhost:8080/` by tomcat maven plugin 
```
mvn compile
mvn tomcat7:run        
```
- You can modify the port in `pom.xml` `project.build.plugins.plugin.configuration.port`
- URL Available : 
    - `/HelloWorld`
    - `/Cookie`
- URL is config by annotation `@WebServlet`
# Feature
- HelloWorld Server
- Cookie-Test

# TODO-LIST
- Session Test
- ...
