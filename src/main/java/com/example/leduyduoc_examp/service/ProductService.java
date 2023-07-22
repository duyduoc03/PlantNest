package com.example.leduyduoc_examp.service;

import com.example.leduyduoc_examp.entity.Product;
import com.example.leduyduoc_examp.entity.Sale;
import com.example.leduyduoc_examp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    @Qualifier("ConfigEntityManager")
    private EntityManager em;

    @Transactional
    @Qualifier("ConfigTransactionManager")
    public void createCustomer(Product product){
        productRepository.save(product);
    }

    public List<Product> findAll(){
        return (List<Product>) productRepository.findAll();
    }
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }

}
