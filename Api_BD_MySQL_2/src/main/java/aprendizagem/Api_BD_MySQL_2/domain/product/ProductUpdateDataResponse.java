package aprendizagem.Api_BD_MySQL_2.domain.product;

import jakarta.validation.constraints.NotNull;

public record ProductUpdateDataResponse(
        @NotNull
        Long id, String description, float price) {


    public ProductUpdateDataResponse(Product dado){
        this(dado.getId(), dado.getDescription(), dado.getPrice());
    }


}