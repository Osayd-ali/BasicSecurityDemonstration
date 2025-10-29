package edu.hield.security0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Example for the most basic form of authentication in Spring Boot using Spring Security default user.
// At startup, Spring Security creates a default user with a generated password.
// It also creates a login form for authentication.
// We can override the default user and password by defining our own user details service or configuring in-memory authentication.
@SpringBootApplication
public class Security0Application {

	// This app uses the default level of security.
	// The default user is "user" and the password is generated at startup.
	// The password is printed in the console.
	// Start with browser at: http://localhost:8080/api/one/hello
	// Then http://localhost:8080/api/two/hello

	public static void main(String[] args) {
		SpringApplication.run(Security0Application.class, args);
	}

}
