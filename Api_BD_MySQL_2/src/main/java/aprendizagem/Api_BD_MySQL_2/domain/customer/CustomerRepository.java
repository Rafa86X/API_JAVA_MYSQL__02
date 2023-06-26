package aprendizagem.Api_BD_MySQL_2.domain.customer;

import aprendizagem.Api_BD_MySQL_2.domain.seller.Seller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findAllByActiveTrue(Pageable page);
}