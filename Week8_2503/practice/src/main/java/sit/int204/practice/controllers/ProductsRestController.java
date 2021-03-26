package sit.int204.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sit.int204.practice.models.Products;
import sit.int204.practice.repositories.ProductsJpaRepository;

import java.util.Optional;

@RestController
public class ProductsRestController {
    @Autowired
    ProductsJpaRepository productsJpaRepository;

    @GetMapping("/products/{code}")
    public Products show(@PathVariable String code) {

        return productsJpaRepository.findById(code).orElse(null);
    }
}
