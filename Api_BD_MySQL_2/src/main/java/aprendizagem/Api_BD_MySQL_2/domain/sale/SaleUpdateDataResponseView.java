package aprendizagem.Api_BD_MySQL_2.domain.sale;

import jakarta.validation.constraints.NotNull;

public record SaleUpdateDataResponseView(
        @NotNull
        Long id, String nome_do_vendedor, String nome_do_cliente, String descricao_do_produto, int quantidade_do_produto) {


    public SaleUpdateDataResponseView(SaleView dado) {
        this(dado.getId(), dado.getNome_do_vendedor(), dado.getNome_do_cliente(), dado.getDescricao_do_produto(), dado.getQuantidade_do_produto());
    }

}
