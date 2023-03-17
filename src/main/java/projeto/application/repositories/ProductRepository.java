package projeto.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.application.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
		
}
