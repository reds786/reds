/*
package com.ettas.reds.config;

import com.ettas.reds.dao.CarRepository;
import com.ettas.reds.dao.StudentRepository;
import com.ettas.reds.model.Car;
import com.ettas.reds.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Repository
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarRepository carRepository, StudentRepository studentRepository) {
        return args -> {
            Car car1 = new Car(

                    "Ford",
                    "Fiesta",
                    1898.99
            );
            Car car2 = new Car(

                    "Ford",
                    "Mustang",
                    79214.51
            );

            carRepository.saveAll(
                    List.of(car1, car2)
            );

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

            studentRepository.saveAll(
                    List.of(reds,alex)
            );


        };
    }

}
*/
