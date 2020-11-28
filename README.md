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
    - `/HelloWorld`
    - `/Cookie`
    - `/SessionTrack`
- URL is config by annotation `@WebServlet`
# Feature
- HelloWorld Server
- Cookie-Test
- SessionTrack
    - Generate session or get existing session.
    - Print some infomation on the server console once a visit happens.

# TODO-LIST
- ~~Session Test~~
- More Test
- ...
