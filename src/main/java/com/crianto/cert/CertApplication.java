package com.crianto.cert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class CertApplication {

    public static void main(String[] args) {
        //SpringApplication.run(CertApplication.class, args);

		SpringApplication application = new SpringApplication(CertApplication.class);
		application.setAdditionalProfiles("ssl");
		application.run(args);
    }

}
