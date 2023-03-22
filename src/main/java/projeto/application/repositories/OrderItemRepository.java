package projeto.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.application.entities.Order;
import projeto.application.entities.OrderItem;
import projeto.application.entities.pk.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK >{
	
	
}
