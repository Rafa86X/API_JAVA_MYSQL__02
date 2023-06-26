package aprendizagem.Api_BD_MySQL_2.domain.product;

import jakarta.validation.constraints.NotNull;

public record ProductRegistrationData(
                                       @NotNull
                                       String description,
                                       @NotNull
                                       float price
                                        ) { }
