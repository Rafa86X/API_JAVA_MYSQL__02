package aprendizagem.Api_BD_MySQL_2.domain.seller;

import jakarta.validation.constraints.NotNull;

public record SellerUpdateDadaResponse(
        @NotNull
        Long id,
        String cpf, String name, String last_name, String date_birth, String telephone,
        String cep, String city, String street, String number, String complement, String Neighborhood) {


    public SellerUpdateDadaResponse(Seller seller){
        this(seller.getId(), seller.getCpf(), seller.getName(), seller.getLast_name(), seller.getDate_birth(),seller.getTelephone(),
                seller.getCep(),seller.getCity(),seller.getStreet(),seller.getNumber(),seller.getComplement(), seller.getNeighborhood());
    }


}
