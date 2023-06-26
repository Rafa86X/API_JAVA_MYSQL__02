package aprendizagem.Api_BD_MySQL_2.domain.product;

import aprendizagem.Api_BD_MySQL_2.domain.seller.Seller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findAllByActiveTrue(Pageable page);
}