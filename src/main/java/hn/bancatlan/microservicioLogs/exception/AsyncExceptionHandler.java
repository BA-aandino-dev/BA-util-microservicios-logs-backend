package hn.bancatlan.microservicioLogs.exception;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

	@Override
	public void handleUncaughtException(Throwable ex, Method method, Object... params) {
		String mensaje = "|Traza: ";
		StackTraceElement[] element = ex.getStackTrace();

		for (int i = 0; i < element.length; i++) {
			mensaje += element[i] + " | ";
		}

		log.error("Nombre de metodo " + method.getName() + " - " + Arrays.toString(params) + " - "
				+ "Mensaje de error: " + ex.getMessage() + " - " + mensaje);
	}
}
