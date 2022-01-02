To execute our project, we need to run two commands in the root directory

$ mvn clean compile install -Dmaven.test.skip=true
$ docker-compose up

Then you can use the following URLs to query data from the REST APIs.
http://localhost:8081/
http://localhost:8081/product/{id}
http://localhost:8081/category/{category}
http://localhost:8081/search/{name}