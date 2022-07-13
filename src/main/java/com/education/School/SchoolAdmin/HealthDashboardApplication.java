package com.education.School.SchoolAdmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class HealthDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthDashboardApplication.class, args);
    }

}
