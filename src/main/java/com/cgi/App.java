package com.cgi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "com.cgi.repository" })

@PropertySource("classpath:application.properties")

public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
