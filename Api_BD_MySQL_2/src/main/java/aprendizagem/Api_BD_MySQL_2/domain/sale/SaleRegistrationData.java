package aprendizagem.Api_BD_MySQL_2.domain.sale;

import jakarta.validation.constraints.*;

public record SaleRegistrationData(
                                       @NotNull
                                       Long cod_product,
                                       @NotNull
                                       Long cod_saler,
                                       @NotNull
                                       Long cod_client,
                                       @NotNull
                                       int quantity) {

}
