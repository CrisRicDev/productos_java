package org.producto.spring.java.producto.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Product {

    private Long id;
    private String Nombre;
    private Double precio;


}
