package projeto.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.application.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{
	
	
}
