package com.example.leduyduoc_examp.service;

import com.example.leduyduoc_examp.entity.Sale;
import com.example.leduyduoc_examp.repository.ProductRepository;
import com.example.leduyduoc_examp.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }
    public Sale findById(int id) {
        return saleRepository.findById(id).orElse(null);
    }

}
