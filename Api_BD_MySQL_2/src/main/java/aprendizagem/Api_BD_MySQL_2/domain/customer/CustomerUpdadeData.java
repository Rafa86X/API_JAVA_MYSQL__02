package aprendizagem.Api_BD_MySQL_2.domain.customer;

import jakarta.validation.constraints.NotNull;

public record CustomerUpdadeData(
        @NotNull
        Long id, String cpf, String name, String last_name,String date_birth,
        String telephone, String cep, String city, String street, String number,
        String complement, String neighborhood) {

}

