package aprendizagem.Api_BD_MySQL_2.domain.seller;

public record SellerDataList(Long id,String nome, String sobrenome, String telefone) {

    public SellerDataList(Seller seller){
        this(seller.getId(),seller.getName(),seller.getLast_name(),seller.getTelephone());
    }
}
