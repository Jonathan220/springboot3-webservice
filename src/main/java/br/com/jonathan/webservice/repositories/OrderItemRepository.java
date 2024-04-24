package br.com.jonathan.webservice.repositories;

import br.com.jonathan.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
