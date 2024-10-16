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
		
		//updating objects
		Veiculos vehicles = manager.find(Veiculos.class, 1L);
		
		System.out.println("current value: " + vehicles.getValor());
		vehicles.setValor(vehicles.getValor().add(new BigDecimal(500)));
		System.out.println("New value: " + vehicles.getValor());
		
		tx.commit();
		manager.close();
		JpaUtil.close();

	}

}
