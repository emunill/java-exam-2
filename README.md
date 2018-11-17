**PRIVALIA JAVA EXAM -2-** 

The project is developed with H2 db in memory. When the app starts, make a request to endpoints in order to get data and persist it.

1. Get user data filtered by user id --- with role 'users' and 'admin':
http://localhost:8080/user/id/{id}

2. Get user data filterd by user name --- with role 'users' and 'admin':
http://localhost:8080/user/name/{userName}

3. Get the list of policies linked to a user name --- with role 'admin':
http://localhost:8080/user/name/{userName}

4. Get the user linked to a policy number --- with role 'admin':
http://localhost:8080/policy/id/{id}


There is an ui to check h2 data available in http://localhost:8080/h2-console

Considerations: 
* All data wanted is embeded on json response. It's better solution implement HATEOAS. 
* Scheduled Task for 1 hour should request data needed and persist it
* Security should be implemented.
* Swagger should be implemented.
* Tests should be implemented