package aprendizagem.Api_BD_MySQL_2.domain.seller;

import jakarta.validation.constraints.*;

public record SellerRegistrationData(
        @NotBlank
        String cpf,
        @NotBlank
        String name,
        @NotBlank
        String last_name,
        @NotBlank
        String date_birth,
        @NotBlank
        String telephone,
        @NotBlank
        String cep,
        @NotBlank
        String city,
        @NotBlank
        String street,
        @NotBlank
        String number,
        @NotBlank
        String neighborhood,
        String complement) {

}
