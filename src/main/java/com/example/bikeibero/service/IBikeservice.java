package com.example.bikeibero.service;

import com.example.bikeibero.domian.Bike;
import com.example.bikeibero.service.dto.BikeDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBikeservice {
    public ResponseEntity create(BikeDTO bikeDTO);

    public List<BikeDTO> read();

    public Bike update(Bike bike);

}
