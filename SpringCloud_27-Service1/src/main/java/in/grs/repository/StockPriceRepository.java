package in.grs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.grs.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {
 
	public StockPrice findByCompany(String companay);
	
}
