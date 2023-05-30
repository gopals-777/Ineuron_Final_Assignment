package in.grs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.grs.Entity.Order;
import in.grs.Entity.User;

public interface OrderRepo extends JpaRepository<Order, Long> {
       public List<Order> findByUser(User user);
	
}
