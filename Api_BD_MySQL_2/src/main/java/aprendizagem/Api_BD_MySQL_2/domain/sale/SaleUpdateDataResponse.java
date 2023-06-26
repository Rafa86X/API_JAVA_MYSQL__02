package aprendizagem.Api_BD_MySQL_2.domain.sale;

import jakarta.validation.constraints.NotNull;

public record SaleUpdateDataResponse(
        @NotNull
        Long id, Long cod_product, Long cod_saler, Long cod_client, int quantity) {


    public SaleUpdateDataResponse(Sale dado){
        this(dado.getId(), dado.getCod_product(), dado.getCod_saler(), dado.getCod_client(), dado.getQuantity());
    }


}