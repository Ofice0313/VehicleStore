package com.caleb.lojaveiculos.application;

import java.math.BigDecimal;

import com.caleb.lojaveiculos.dominio.Veiculos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Main {

	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		
		Veiculos vehicle = new Veiculos();
		
		vehicle.setFabricante("Honda");
		vehicle.setModelo("Civic");
		vehicle.setAnoFabricacao(2020);
		vehicle.setAnoModelo(2020);
		vehicle.setValor(new BigDecimal(90500));
		
		manager.persist(vehicle);
		
		tx.commit();
		manager.close();
		JpaUtil.close();

	}

}
