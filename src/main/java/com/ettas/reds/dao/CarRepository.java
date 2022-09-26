package com.ettas.reds.dao;

import com.ettas.reds.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  CarRepository  extends JpaRepository<Car,Long> {

    @Query("SELECT s FROM Car s WHERE s.model =?1 ")
    Optional<List<Car>> findCarByModel(String model);

}
