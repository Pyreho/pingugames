package org.pingus.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@EnableJpaRepositories("org.pingus")
@EntityScan("org.pingus")
@Configuration
@EnableAutoConfiguration
@ComponentScan("org.pingus")
public class Application {
        public static void main(String[] args) {
            ApplicationContext ctx = SpringApplication.run(Application.class, args);

            System.out.println("A ver a ver...");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        }
}
