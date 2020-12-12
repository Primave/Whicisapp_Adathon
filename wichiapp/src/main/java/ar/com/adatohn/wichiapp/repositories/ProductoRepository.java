package ar.com.adatohn.wichiapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.adatohn.wichiapp.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}
