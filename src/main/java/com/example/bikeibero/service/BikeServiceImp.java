package com.example.bikeibero.service;

import com.example.bikeibero.domian.Bike;
import com.example.bikeibero.repository.BikeRepository;
import com.example.bikeibero.service.dto.BikeDTO;
import com.example.bikeibero.service.transformer.BikeTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BikeServiceImp implements IBikeservice {

    @Autowired
    BikeRepository bikeRepository;

    @Override
    public ResponseEntity create(BikeDTO bikeDTO) {
        Bike bike = BikeTransformer.getBikeFromBikeDTO(bikeDTO);
        if(bikeRepository.findBySerial(bike.getSerial()).isPresent()){
            return new ResponseEntity("El serial ya existe", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity(BikeTransformer.getBikeDTOFromBike(bikeRepository.save(bike)), HttpStatus.OK);
        }

    }

    @Override
    public Page<BikeDTO> read(Integer pageSize, Integer pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return bikeRepository.findAll(pageable)
                .map(BikeTransformer::getBikeDTOFromBike);
    }

    @Override
    public Bike update(Bike bike) {
        return bikeRepository.save(bike);
    }

}
