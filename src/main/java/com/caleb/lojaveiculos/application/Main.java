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
		
		vehicle.setFabricante("VW");
		vehicle.setModelo("Gol");
		vehicle.setAnoFabricacao(2019);
		vehicle.setAnoModelo(2020);
		vehicle.setValor(new BigDecimal(35000));
		manager.persist(vehicle);
		tx.commit();
		
		manager.close();
		JpaUtil.close();

	}

}
