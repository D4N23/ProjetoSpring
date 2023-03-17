package projeto.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.application.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
		
}
