package in.grs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.grs.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
