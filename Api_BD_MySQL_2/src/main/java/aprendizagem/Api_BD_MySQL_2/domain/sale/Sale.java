package aprendizagem.Api_BD_MySQL_2.domain.sale;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

@Table(name = "sales")
@Entity(name = "Sale")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Sale {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cod_product;
    private Long cod_saler;
    private Long cod_client;
    private int quantity;


    public Sale(SaleRegistrationData dados) {

        this.cod_product = dados.cod_product();
        this.cod_saler = dados.cod_saler();
        this.cod_client = dados.cod_client();
        this.quantity = dados.quantity();

    }

    public void updater(SaleUpdadeData dados){
        if(dados.cod_product() != null){
            this.cod_product =dados.cod_product();
        }
        if(dados.cod_saler() != null){
            this.cod_saler =dados.cod_saler();
        }
        if(dados.cod_client() != null){
            this.cod_client =dados.cod_client();
        }
        if(dados.quantity() != 0){
            this.quantity =dados.quantity();
        }

    }

}
