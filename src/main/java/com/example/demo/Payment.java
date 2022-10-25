package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private String cardnumber;
	private String cardholdername;
	private String expiry;
	private String cvv;
	

}
