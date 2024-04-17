package br.com.jonathan.webservice.repositories;

import br.com.jonathan.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
