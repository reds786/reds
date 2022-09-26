/*
package com.ettas.reds.config;

import com.ettas.reds.dao.StudentRepository;
import com.ettas.reds.model.Student;
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
           Student reds = new Student(
                    "Reds",
                    "reds@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student alex =new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2009, Month.DECEMBER, 17)
            );

            repository.saveAll(
                    List.of(reds,alex)
            );


        };

    }

}
*/
