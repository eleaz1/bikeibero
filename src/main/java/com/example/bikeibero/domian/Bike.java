package com.example.bikeibero.domian;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private Long id;

    @Column(name = "model", length = 40)
    private String model;

    @NotNull
    @Column(name = "serial", length = 40, unique = true)
    private String serial;

    @Column(name = "price")
    private Double price;

  }

