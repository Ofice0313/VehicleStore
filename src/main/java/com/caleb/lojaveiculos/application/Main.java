package com.caleb.lojaveiculos.application;

import java.math.BigDecimal;

import com.caleb.lojaveiculos.dominio.Veiculos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Main {

	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		
		Veiculos vehicle = manager.find(Veiculos.class, 1L);
		 
		System.out.println("Vehicle code " + vehicle.getCodigo() + " is a " + vehicle.getModelo());
		
		manager.close();
		JpaUtil.close();

	}

}
