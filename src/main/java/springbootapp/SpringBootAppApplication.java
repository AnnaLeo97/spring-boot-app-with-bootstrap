package springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAppApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

//	@Bean
//	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
//	webServerFactoryCustomizer() {
//		return factory -> factory.setContextPath("/src/main/resources/templates");
//	}
}
