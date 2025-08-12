package pe.mil.ejercito.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Application
 * <p>
 * Application class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil.pe
 * @since 25/02/2024
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {
        "pe.mil.ejercito.lib.utils",
        "pe.mil.ejercito.lib.repository",
        "pe.mil.ejercito.microservice",
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}