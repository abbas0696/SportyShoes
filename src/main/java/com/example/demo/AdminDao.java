package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AdminDao {
	
	@Autowired
	AdminRepository repo;
	
	@Autowired
	ProductRepository pero;
	
	@Autowired
	PaymentRepository tero;
	
	public AdminLogin insert(AdminLogin ee) {
		return repo.save(ee);
	}
	
	public List<AdminLogin> getall(){
		return repo.findAll();
	}
	
	public Product create(Product pp) {
		return pero.save(pp);
	}
	public List<Product> findall(){
		return pero.findAll();
	}
	
	public Payment display(Payment tt) {
		return tero.save(tt);
	}
	}

