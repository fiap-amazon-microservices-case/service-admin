package br.com.fiap.aoj.serviceadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import static br.com.fiap.aoj.serviceadmin.Application.BASE_PACKAGE;

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = { BASE_PACKAGE })
public class Application {

	static final String BASE_PACKAGE = "br.com.fiap.aoj";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
