package com.edw;

import org.apache.camel.component.hystrix.metrics.servlet.HystrixEventStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * <pre>
 *     com.edw.Application
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 09 Jul 2020 21:46
 */
@EnableCircuitBreaker
@EnableHystrixDashboard
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public HystrixEventStreamServlet hystrixServlet() {
        return new HystrixEventStreamServlet();
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new HystrixEventStreamServlet(), "/hystrix.stream");
    }
}
