package com.ettas.reds.service;

import com.ettas.reds.dao.CarRepository;
import com.ettas.reds.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public ResponseEntity<String> addNewCar(Car car) {

        Optional<List<Car>> optionalCar = carRepository.findCarByModel(car.getModel());
        /*System.out.println(optionalCar);
        int size = optionalCar.map(List::size).orElse(0);
        System.out.println("<<<Size>>> is "+ size);*/

            if (!optionalCar.get().isEmpty()) {
                return ResponseEntity.ok("Model already exists.");
            }



        carRepository.save(car);
        System.out.println(car);
        return ResponseEntity.ok("Model is Saved.");

    }

}