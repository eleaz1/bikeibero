package com.example.bikeibero.service.transformer;

import com.example.bikeibero.domian.Bike;
import com.example.bikeibero.service.dto.BikeDTO;

public interface BikeTransformer {
    public static BikeDTO getBikeDTOFromBike(Bike bike){
        if (bike == null){
            return null;
        }

        BikeDTO dto = new BikeDTO();

        //set variables
        dto.setId(bike.getId());
        dto.setModel(bike.getModel());
        dto.setPrice(bike.getPrice());
        dto.setSerial(bike.getSerial());

        return dto;
    }

    public static Bike getBikeFromBikeDTO (BikeDTO dto){
        if (dto == null){
            return null;
        }

        Bike bike = new Bike();

        bike.setId(dto.getId());
        bike.setModel(dto.getModel());
        bike.setPrice(dto.getPrice());
        bike.setSerial(dto.getSerial());

        return bike;
    }

}
