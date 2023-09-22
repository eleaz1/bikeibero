package com.example.bikeibero.service.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BikeDTO implements Serializable {

    @NotNull
    private Long id;

    private String model;
    private Double price;
    private String serial;

}
