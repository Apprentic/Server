package com.zixiangz.apprentic;

import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.time.Clock;

/**
 * Main Events Server class which boots the Events Server
 */
@SpringBootApplication
@EnableScheduling
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public Clock getClock() {
        return Clock.systemUTC();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
        registration.addUrlMappings("/console/*");
        return registration;
    }
}
