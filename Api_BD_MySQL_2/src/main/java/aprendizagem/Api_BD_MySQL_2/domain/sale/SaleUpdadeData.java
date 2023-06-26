package aprendizagem.Api_BD_MySQL_2.domain.sale;

import jakarta.validation.constraints.NotNull;

public record SaleUpdadeData(
        @NotNull
        Long id, Long cod_product, Long cod_saler, Long cod_client, int quantity) {

}

