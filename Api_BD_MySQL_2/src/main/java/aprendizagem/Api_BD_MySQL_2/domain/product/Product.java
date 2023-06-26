package aprendizagem.Api_BD_MySQL_2.domain.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "product")
@Entity(name = "Product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private float price;
    private boolean active;

    public Product(ProductRegistrationData dados) {
        this.active = true;
        this.description = dados.description();
        this.price = dados.price();
    }

    public void updater(ProductUpdadeData dados){
        if(dados.description() != null){
            this.description =dados.description();
        }
        if(dados.price() != 0){
            this.price =dados.price();
        }
    }
    public void deleter() {
        this.active = false;
    }

}
