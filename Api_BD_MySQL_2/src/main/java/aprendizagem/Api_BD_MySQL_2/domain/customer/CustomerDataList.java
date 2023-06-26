package aprendizagem.Api_BD_MySQL_2.domain.customer;


public record CustomerDataList(Long id, String nome, String sobrenome, String telefone) {

    public CustomerDataList(Customer dado){
        this(dado.getId(), dado.getName(),dado.getLast_name(),dado.getTelephone());
    }
}