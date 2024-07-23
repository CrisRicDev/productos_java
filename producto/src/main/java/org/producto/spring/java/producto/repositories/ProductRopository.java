package org.producto.spring.java.producto.repositories;

import java.util.List;

import org.producto.spring.java.producto.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRopository {

    //la lista de un repositorio 
    //debe se ser inmutable
    //la logica de un negocio no modifica 
    // la lista de un repo
    List<Product> productos = List.of(new Product(1L, "sila reclinable", 3450000.0),
                                    new Product(2L, "Escritorio", 200000.0));

    /*metodo (comportamiento) para comsultar todos
    * los productos del repository
    */
        public List<Product> findAll(){
            return this.productos;
        }


}
