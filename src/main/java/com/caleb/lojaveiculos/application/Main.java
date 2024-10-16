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
		
		//inserting new objects
		Veiculos vehicle = new Veiculos();
		
		vehicle.setFabricante("Ford");
		vehicle.setModelo("Fiesta");
		vehicle.setAnoFabricacao(2020);
		vehicle.setAnoModelo(2019);
		vehicle.setValor(new BigDecimal(42000));
		manager.persist(vehicle);
		tx.commit();
		
		manager.close();
		JpaUtil.close();

	}

}
