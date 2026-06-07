### API Documentation Dependency
I got the Swagger UI dependency from official Maven Repository website and it url is https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui/2.8.5.

It Automatically make the UI to run on browser on this URL
http://localhost:8080/swagger-ui/index.html
<h3>The swagger UI dependency </h3>

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.8.5</version>
</dependency>
````
<h2>Created APIs<h2/>

1. AuthenticationController

   http://localhost:8080/api/auth/register
   http://localhost:8080/api/auth/login

2. UserController

   http://localhost:8080/api/users

3. PollController

   http://localhost:8080/api/poll/create-poll
4.
http://localhost:8080/api/poll/created
5.
http://localhost:8080/api/poll/pending
6.
http://localhost:8080/api/poll/${id}
7.
http://localhost:8080/api/poll/${id}/invite
8.
http://localhost:8080/api/poll/${id}/submit
9.
http://localhost:8080/api/poll/${id}
10.
http://localhost:8080/api/poll/${id}/finish
11.
http://localhost:8080/api/poll/${id}


Use of AI
Due to the usage of lombok, we added dependency from spring intializr but it was giving error of version so i use AI for that


```
        <lombok.version>1.18.46</lombok.version>


          <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>25</source>
                    <target>25</target>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>${lombok.version}</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>

```