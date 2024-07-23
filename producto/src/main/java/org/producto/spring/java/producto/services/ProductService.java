package org.producto.spring.java.producto.services;

import java.util.List;

import org.producto.spring.java.producto.entities.Product;
import org.producto.spring.java.producto.repositories.ProductRopository;

public class ProductService {

    /*inyectar la dependecnaial repositprio */
    private ProductRopository repository
        = new ProductRopository();


        /*operaiones de logia de negociso
         * casos de uso , historia de usuario
         * requerimientos funcionales 
         */
    public List<Product> findAllProducts(){
        return repository.findAll();
    }
}

