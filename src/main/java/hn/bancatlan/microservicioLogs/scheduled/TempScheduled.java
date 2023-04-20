package hn.bancatlan.microservicioLogs.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TempScheduled {

	StopWatch timer = new StopWatch();

	@Scheduled(cron = "${cronTemp}")
	public void tareaProgramadaTemp() {
		timer.start();
		log.info("*************************************************************************************************");
		log.info("Inicio De Ejecución Tarea Programada");

		try {
			/* Service... */
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
		}

		timer.stop();
		log.info("Procesamiento -> Total tiempo en segundos: " + timer.getTotalTimeSeconds());
		log.info("Fin De Ejecuión De  Tarea Programada");
		log.info("*************************************************************************************************");
	}
}
