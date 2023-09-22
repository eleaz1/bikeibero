package com.example.bikeibero.web;

import com.example.bikeibero.domian.Bike;
import com.example.bikeibero.service.IBikeservice;
import com.example.bikeibero.service.dto.BikeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class BikeResource {

    @Autowired
    IBikeservice bikeService;

    @PostMapping("/bike")
    public ResponseEntity create(@RequestBody BikeDTO bikeDTO) {
        return bikeService.create(bikeDTO);
    }

    //Get
    // Example: http://localhost:8080/api/bike?pageSize=6&pageNumber=0
    @GetMapping("/bike")
    public Page<BikeDTO> read(@PathParam("pageSize") Integer pageSize,
                              @PathParam("pageNumber") Integer pageNumber ) {
        return bikeService.read(pageSize, pageNumber);
    }

    //Put
    @PutMapping("/bike")
    public Bike update(@RequestBody Bike bike) {
        return bikeService.update(bike);
    }

}
