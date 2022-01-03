To execute our project, we need to run two commands in the root directory <br>
 <br>
$ mvn clean compile install -Dmaven.test.skip=true <br>
$ docker-compose up <br>

Then you can use the following URLs to query data from the REST APIs. <br>
http://localhost:8081/ <br>
http://localhost:8081/product/{id} <br>
http://localhost:8081/category/{category} <br>
http://localhost:8081/search/{name} <br>