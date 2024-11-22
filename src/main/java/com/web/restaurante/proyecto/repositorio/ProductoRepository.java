package com.web.restaurante.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.restaurante.proyecto.clases.productos.Producto;
@Repository
public interface ProductoRepository  extends JpaRepository<Producto, String>{
}