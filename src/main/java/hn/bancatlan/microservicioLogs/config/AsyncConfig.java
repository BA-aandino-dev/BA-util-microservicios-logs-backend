package hn.bancatlan.microservicioLogs.config;

import java.util.concurrent.Executor;

import hn.bancatlan.microservicioLogs.exception.AsyncExceptionHandler;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfig extends AsyncConfigurerSupport {

	@Autowired
	private AsyncExceptionHandler asyncExceptionHandler;

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(50);
		taskExecutor.setMaxPoolSize(100);
		taskExecutor.setQueueCapacity(1000);
		taskExecutor.setWaitForTasksToCompleteOnShutdown(false);
		taskExecutor.setThreadNamePrefix("Async-");
		taskExecutor.initialize();
		return super.getAsyncExecutor();
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return asyncExceptionHandler;
	}

}
