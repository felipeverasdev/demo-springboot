package br.com.felipe.demo_springboot.repositories;

import br.com.felipe.demo_springboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
