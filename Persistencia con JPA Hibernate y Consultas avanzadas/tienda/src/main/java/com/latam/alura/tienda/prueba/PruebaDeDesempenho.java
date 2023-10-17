package com.latam.alura.tienda.prueba;

import java.io.FileNotFoundException;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.PedidoDao;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.CategoriaId;
import com.latam.alura.tienda.modelo.Pedido;
import com.latam.alura.tienda.utils.JPAUtils;

public class PruebaDeDesempenho {
	public static void main(String[] args) throws FileNotFoundException {
		LoadRecords.cargarRegistros();
		
		EntityManager em = JPAUtils.getEntityManager();
		
		PedidoDao pedidoDao = new PedidoDao(em);
		Pedido pedidoConCliente = pedidoDao.consultarPedidoConCliente(2l);
		Pedido pedidoConItems = pedidoDao.consultarPedidoItems(2l);
		
		em.close();
		
		System.out.println(pedidoConCliente.getFecha());
		System.out.println(pedidoConItems.getItems().size());
		System.out.println(pedidoConCliente.getCliente().getNombre());
		
	}
}
