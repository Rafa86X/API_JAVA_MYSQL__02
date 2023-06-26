package aprendizagem.Api_BD_MySQL_2.domain.sale;

import aprendizagem.Api_BD_MySQL_2.domain.seller.Seller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepositoryView extends JpaRepository<SaleView, Long> {
}
