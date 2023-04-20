package hn.bancatlan.microservicioLogs;

import hn.bancatlan.microservicioLogs.config.MyPropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAsync
@Slf4j
@EnableCaching
public class MicroServicioBaseApplication implements CommandLineRunner {

	@Autowired
	private MyPropertiesConfig myProp;

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioBaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Servicio Iniciado En Ambiente: " + myProp.getPerfilActivoAmbiente());
	}
}
