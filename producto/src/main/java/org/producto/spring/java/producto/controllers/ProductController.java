package org.producto.spring.java.producto.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.producto.spring.java.producto.entities.Product;
import org.producto.spring.java.producto.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/products")
public class ProductController {

    /*
     * inyectar un servicio
     */
    private ProductService service = new ProductService();
    /*primer endpoint :
     * Endpoint: un metodo en un controlador 
     */
    @GetMapping("/saludo")
    public String saludo(){
        return "hola---carecola";
    }

    /*segundo endpoin
     * GET: obtener informacion sin alterarla
     * inmutable
     */

     @GetMapping("/{idproducto}")
     public String findproductById(@PathVariable String idproducto) {
         return "aqui se msotrara el producto cuyo id es: " + idproducto;
     }
     
     @GetMapping
     public List<Product> findAllProducts() {
         /* utilizo el servicio */
         return service.findAllProducts();
     }
     
}
