# spring-rest

## Links
https://www.mkyong.com/spring-mvc/gradle-spring-mvc-web-project-example/







========================= POST =========

POST /spring4/employees HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Cache-Control: no-cache
Postman-Token: 2bd1c1f9-6565-8d60-a79d-2169bbc1a619

{
    "name": "Sheetal",
    "salary": 30000,
    "id": 3
}

======================================== URL Encoded post =========

POST /spring4/employeesform HTTP/1.1
Host: localhost:8080
Content-Type: application/x-www-form-urlencoded
Cache-Control: no-cache
Postman-Token: 8fc0874d-9f7f-0b3c-a73d-8867ab8a8753

name=Ramesh&salary=20000&id=120

===================================================================