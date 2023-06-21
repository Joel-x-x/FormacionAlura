package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.model.Producto;

public class ProductoDAO {
	final private Connection con;
	
	public ProductoDAO(Connection con) {
		this.con = con;
	}
	
	public void guardar(Producto producto) {
		try {
			final PreparedStatement statement  = con.prepareStatement("insert into producto(nombre, descripcion, cantidad, categoria_id)"
					+ "values(?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			try(statement) {
				statement.setString(1, producto.getNombre());
				statement.setString(2, producto.getDescripcion());
				statement.setInt(3, producto.getCantidad());
				statement.setInt(4, producto.getCategoriaId());
				
				statement.execute();
				
				final ResultSet resultSet = statement.getGeneratedKeys();
				
				try(resultSet) {
					while(resultSet.next()) {
						producto.setId(resultSet.getInt(1));
						System.out.println(String.format("Fue insertado el producto id %s", producto));
					}
				}
			} 
		} catch(SQLException e) {
				throw new RuntimeException(e);
		}
	}
	
	public List<Producto> listar() {
		List<Producto> resultado = new ArrayList<>();
		
		try {
			final PreparedStatement statement = con.prepareStatement("select * from producto");
			
			try(statement) {
				
				statement.execute();
				
				final ResultSet resultSet = statement.getResultSet();
				
				try(resultSet) {
					while(resultSet.next()) {
						resultado.add(new Producto(
								resultSet.getInt("id"),
								resultSet.getString("nombre"),
								resultSet.getString("descripcion"),
								resultSet.getInt("cantidad")));
					}
					return resultado;
				}
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Integer eliminar(Integer id) {
		try {
			
			final PreparedStatement statement = con.prepareStatement("delete from producto where id = ?");
			
			try(statement) {
				
				statement.setInt(1, id);
				
				statement.execute();
				
				int nItem = statement.getUpdateCount();
				
				return nItem;
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Integer modificar(Producto producto) {
		try {
			
			final PreparedStatement statement = con.prepareStatement("update producto set nombre = ?, descripcion = ? where id = ?");
			
			try(statement) {
				
				statement.setString(1, producto.getNombre());
				statement.setString(2, producto.getDescripcion());
				statement.setInt(3, producto.getId());
				
				statement.execute();
				
				int nItem = statement.getUpdateCount();
				
				return nItem;
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
				
	}

	public List<Producto> listar(Integer categoriaId) {
		List<Producto> resultado = new ArrayList<>();
		
				try {
					final PreparedStatement statement = con.prepareStatement("select * from producto"
							+ " where categoria_id = ?");
					
					try(statement) {
						
						statement.setInt(1, categoriaId);
						
						statement.execute();
						
						final ResultSet resultSet = statement.getResultSet();
						
						try(resultSet) {
							while(resultSet.next()) {
								resultado.add(new Producto(
										resultSet.getInt("id"),
										resultSet.getString("nombre"),
										resultSet.getString("descripcion"),
										resultSet.getInt("cantidad")));
							}
							return resultado;
						}
					}
				} catch(SQLException e) {
					throw new RuntimeException(e);
				}
			}
	
}
