package aprendizagem.Api_BD_MySQL_2.domain.customer;

import aprendizagem.Api_BD_MySQL_2.domain.seller.Seller;
import jakarta.validation.constraints.NotNull;

public record CustomerUpdateDataResponse(
        @NotNull
        Long id,
        String cpf, String name, String last_name, String date_birth, String telephone,
        String cep, String city, String street, String number, String complement, String Neighborhood) {


    public CustomerUpdateDataResponse(Customer dado){
        this(dado.getId(), dado.getCpf(), dado.getName(), dado.getLast_name(), dado.getDate_birth(),dado.getTelephone(),
                dado.getCep(),dado.getCity(),dado.getStreet(),dado.getNumber(),dado.getComplement(), dado.getNeighborhood());
    }


}