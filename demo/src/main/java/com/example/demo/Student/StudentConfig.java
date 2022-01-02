package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));

            Student alex = new Student("john",
                    "john.jamal@gmail.com",
                    LocalDate.of(1995, Month.JANUARY, 5));

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
