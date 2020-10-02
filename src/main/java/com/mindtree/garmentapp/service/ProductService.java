package com.mindtree.garmentapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.garmentapp.entity.Product;
import com.mindtree.garmentapp.repository.ProductRepository;
import java.util.*;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService {

	   @Autowired
	    private ProductRepository repo;
	     
	    public List<Product> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Product product) {
	        repo.save(product);
	    }
	     
	    public Product get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
	}

