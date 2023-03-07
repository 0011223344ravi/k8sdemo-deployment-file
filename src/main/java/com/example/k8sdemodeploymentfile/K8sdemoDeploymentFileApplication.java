package com.example.k8sdemodeploymentfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sdemoDeploymentFileApplication {


	@GetMapping("/hello")
	public String getMessage() {
		return "Welcome to EnggAdda";
	}
	public static void main(String[] args) {
		SpringApplication.run(K8sdemoDeploymentFileApplication.class, args);
	}

}
