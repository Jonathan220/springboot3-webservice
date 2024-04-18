package br.com.jonathan.webservice.repositories;

import br.com.jonathan.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
