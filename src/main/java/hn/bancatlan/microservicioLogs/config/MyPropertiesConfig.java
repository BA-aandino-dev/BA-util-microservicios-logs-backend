package hn.bancatlan.microservicioLogs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Data
@Configuration
@PropertySource(value = { "classpath:application.properties" }, ignoreResourceNotFound = true)
public class MyPropertiesConfig {

	@Value("${jdbc.driver}")
	private String driver;

	@Value("${url}")
	private String url;

	@Value("${user.db}")
	private String user;

	@Value("${pass.db}")
	private String password;

	@Value("${spring.profiles.active}")
	private String perfilActivoAmbiente;
}
