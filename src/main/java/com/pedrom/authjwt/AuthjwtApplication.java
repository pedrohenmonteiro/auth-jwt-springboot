package com.pedrom.authjwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "springSecurityAuditorAware")
public class AuthjwtApplication {

	private static final Logger LOG = LoggerFactory.getLogger(AuthjwtApplication.class);

    private final Environment env;

    public AuthjwtApplication(Environment env) {
        this.env = env;
    }

	public static void main(String[] args) {
		SpringApplication.run(AuthjwtApplication.class, args);

		
	}

}
