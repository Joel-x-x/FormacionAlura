package com.latam.alura.tienda.dao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import com.latam.alura.tienda.modelo.Cliente;
import com.latam.alura.tienda.modelo.Producto;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock;

public class ProductoDao {
	
	private EntityManager em;

	public ProductoDao(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Producto producto) {
		this.em.persist(producto);
	}
	
	public void actualizar(Producto producto) {
		this.em.merge(producto);
	}
	
	public void remover(Producto producto) {
		producto=this.em.merge(producto);
		this.em.remove(producto);
	}
	
	public Producto consultaPorId(Long id) {
		return em.find(Producto.class, id);
	}
	
	public List<Producto> consultarTodos(){
		String jqpl= "SELECT P FROM Producto AS P";
		return em.createQuery(jqpl,Producto.class).getResultList();
	}
	
	public List<Producto> consultaPorNombre(String nombre){
		String jpql ="SELECT P FROM Producto AS P WHERE P.nombre=:nombre";
		return em.createQuery(jpql,Producto.class).setParameter("nombre", nombre).getResultList();
	}
	
	public List<Producto> consultaPorNombreDeCategoria(String nombre){
		String jpql="SELECT p FROM Producto AS p WHERE p.categoria.nombre=:nombre";
		return em.createQuery(jpql,Producto.class).setParameter("nombre", nombre).getResultList();
	}

	public BigDecimal consultarPrecioPorNombreDeProducto(String nombre) {
		return em.createNamedQuery("Producto.consultarPrecioPorNombre",BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
	}
	
	public List<Producto> consultaAPICriteria(String nombre, BigDecimal precio, LocalDate fecha) {
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		CriteriaQuery<Producto> createQuery = criteriaBuilder.createQuery(Producto.class);
		
		Root<Producto> from = createQuery.from(Producto.class);
		
		Predicate filtro = criteriaBuilder.and();
		
		if(nombre != null && !nombre.trim().isEmpty()) {
			filtro = criteriaBuilder.and(filtro, criteriaBuilder.equal(from.get("nombre"), nombre));
		}
		
		if(precio != null && !precio.equals(new BigDecimal(0))) {
			filtro = criteriaBuilder.and(filtro, criteriaBuilder.equal(from.get("precio"), precio));
		}
		
		if(fecha != null) {
			filtro = criteriaBuilder.and(filtro, criteriaBuilder.equal(from.get("fecha"), fecha));
		}
		
		return em.createQuery(createQuery.where(filtro)).getResultList();
	}
	
}
