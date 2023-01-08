package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student luca = new Student(
                    "Luca",
                    "luca@mail.com",
                    LocalDate.of(2000, AUGUST, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@mail.com",
                    LocalDate.of(2004, JANUARY, 4)
            );
            repository.saveAll(
                    List.of(luca,alex)
            );
        };
    }
}
