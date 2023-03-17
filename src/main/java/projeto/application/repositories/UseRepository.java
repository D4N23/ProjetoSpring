package projeto.application.repositories;

import projeto.application.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UseRepository  extends JpaRepository<User, Long>{
	
	
}
