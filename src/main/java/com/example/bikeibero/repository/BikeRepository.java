package com.example.bikeibero.repository;

import com.example.bikeibero.domian.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeRepository extends JpaRepository<Bike, Long> {
    Optional<Bike> findBySerial(String serial);

}
