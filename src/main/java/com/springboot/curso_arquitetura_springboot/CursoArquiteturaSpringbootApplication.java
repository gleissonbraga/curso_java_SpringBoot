package com.springboot.curso_arquitetura_springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class CursoArquiteturaSpringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(CursoArquiteturaSpringbootApplication.class, args);

		// MÉTODOS PARA INICIAR A APLICAÇÃO A PARTIR DO QUE VOCÊ DESEJA

		// SpringApplicationBuilder builder = new SpringApplicationBuilder(CursoArquiteturaSpringbootApplication.class);
		// builder.run(args);
		// builder.bannerMode(Banner.Mode.OFF);
		// ConfigurableApplicationContext applicationContext = builder.context();
//		var produtoRepository = applicationContext.getBean("produtoRepository");

		// builder.profiles("producao");
		// ConfigurableEnvironment environment = applicationContext.getEnvironment();
		// String applicationName = environment.getProperty("spring.application.name");
		// System.out.println("Nome da aplicação " + applicationName);
	}

}
