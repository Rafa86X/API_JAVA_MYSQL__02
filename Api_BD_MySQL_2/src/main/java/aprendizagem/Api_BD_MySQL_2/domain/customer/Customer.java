package aprendizagem.Api_BD_MySQL_2.domain.customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "customers")
@Entity(name = "Customer")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Customer{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String name;


    private String last_name;
    private String date_birth;
    private String telephone;
    private String cep;
    private String city;
    private String neighborhood;
    private String street;
    private String number;
    private String complement;
    private boolean active;

    public Customer(CustomerRegistrationData dados) {
        this.active = true;
        this.cpf = dados.cpf();
        this.name = dados.name();
        this.last_name = dados.last_name();
        this.date_birth = dados.date_birth();
        this.telephone = dados.telephone();
        this.cep = dados.cep();
        this.city=dados.city();
        this.neighborhood = dados.neighborhood();
        this.street = dados.street();
        this.number = dados.number();
        this.complement = dados.complement();
    }

    public void updater(CustomerUpdadeData dados){
        if(dados.name() != null){
            this.name =dados.name();
        }
        if(dados.cpf() != null){
            this.cpf =dados.cpf();
        }
        if(dados.last_name() != null){
            this.last_name =dados.last_name();
        }
        if(dados.date_birth() != null){
            this.date_birth =dados.date_birth();
        }
        if(dados.telephone() != null){
            this.telephone =dados.telephone();
        }
        if(dados.cep() != null){
            this.cep =dados.cep();
        }
        if(dados.city() != null){
            this.city =dados.city();
        }
        if(dados.street() != null){
            this.street =dados.street();
        }
        if(dados.number() != null){
            this.number =dados.number();
        }
        if(dados.complement() != null){
            this.complement =dados.complement();
        }
        if(dados.neighborhood() != null){
            this.neighborhood =dados.neighborhood();
        }

    }

    public void deleter() {
        this.active = false;
    }

}
