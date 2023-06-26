package aprendizagem.Api_BD_MySQL_2.domain.sale;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "minha_view")
@Entity(name = "Minha_View")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class SaleView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_do_vendedor;
    private String nome_do_cliente;
    private String descricao_do_produto;
    private int quantidade_do_produto;
}
