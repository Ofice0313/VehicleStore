package com.caleb.lojaveiculos.application;

import java.math.BigDecimal;
import java.util.List;

import com.caleb.lojaveiculos.dominio.Veiculos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class Main {

	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		//Deleting object
		Veiculos vehicles = manager.find(Veiculos.class, 1L);
		
		manager.remove(vehicles);
		
		tx.commit();
		manager.close();
		JpaUtil.close();

	}

}
