package com.caleb.lojaveiculos.application;

import java.util.List;

import com.caleb.lojaveiculos.dominio.Veiculos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class Main {

	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		
		//Listing objects from Veiculos using JPQL
		Query query = manager.createQuery("select v from Veiculos v");
		List<Veiculos> veiculos = query.getResultList();
		
		for(Veiculos vehicles: veiculos) {
			System.out.println(vehicles.getCodigo() + " -"
					+ vehicles.getFabricante() + " "
					+ vehicles.getModelo() + ", ano "
					+ vehicles.getAnoFabricacao() + " por "
					+ "R$" + vehicles.getValor());
		}
		
		manager.close();
		JpaUtil.close();

	}

}
