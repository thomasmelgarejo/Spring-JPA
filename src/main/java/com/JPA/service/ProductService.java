package com.JPA.service;

import com.JPA.model.Product;
import com.JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.HashSet;
import java.util.Set;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Set<Product> findAll(){
        Set<Product> products = new HashSet<>();
        for (Product product: productRepository.findAll()){

            products.add(product);
        }
        return products;
    }

    public Product findById(long id) {
        //denne returnere Product eller kaster exception hvis intet fundet
        return productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void update(Product product, long id) {

        productRepository.save(product);
    }
}
