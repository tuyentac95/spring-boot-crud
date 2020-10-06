package com.codegym.demo.service;

import com.codegym.demo.model.Product;
import com.codegym.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public Product findById(Long id){
        return productRepository.getOne(id);
    }

    public void delete(Long id){
        productRepository.deleteById(id);
    }
}
