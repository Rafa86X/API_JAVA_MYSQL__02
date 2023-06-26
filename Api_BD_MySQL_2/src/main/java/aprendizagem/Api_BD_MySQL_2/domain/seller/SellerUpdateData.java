package aprendizagem.Api_BD_MySQL_2.domain.seller;


import jakarta.validation.constraints.NotNull;

public record SellerUpdateData(
        @NotNull
        Long id, String cpf, String name, String last_name,String date_birth,
        String telephone, String cep, String city, String street, String number,
        String complement, String neighborhood) {

}
