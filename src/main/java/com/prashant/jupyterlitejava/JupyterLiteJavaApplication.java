package com.prashant.jupyterlitejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class JupyterLiteJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JupyterLiteJavaApplication.class, args);
	}
	@GetMapping("/")
	public String loadJupyterLite(){
		return "index.html";
	}

}
