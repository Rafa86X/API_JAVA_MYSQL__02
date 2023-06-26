package aprendizagem.Api_BD_MySQL_2.controller;

import aprendizagem.Api_BD_MySQL_2.domain.seller.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


//	"cpf":"11122233343",
//	"name":"Michelangelo",
//	"last_name":"Tartaruga Ninja",
//	"date_birth":"1975-10-19",
//	"telephone":"51994515286",
//	"cep":"93052270",
//	"city":"Pibobango",
//	"neighborhood":"flafluringa",
//	"street":"ksksksss",
//	"number":"123456",
//	"complement": ""


@RestController // é um rest controller
@RequestMapping("seller") // receba as requisiçoes para o enderco seller
public class SellerController {


    // O retorno dos metodos precisa ser mais presiso do que 200 ok por isso o ResponseEntity

    @Autowired
    private SellerRepository repository; // injeçao de dependecia repository



    @PostMapping// metodo get http
    @Transactional// interaçao de ediçao com banco de dados
    public ResponseEntity register(@RequestBody @Valid SellerRegistrationData dados){

        var p = repository.save(new Seller(dados));// injeta comando sql de inserção de dados no banco de dados
        return ResponseEntity.ok(p);

    }
    //************************************************************************************
    // esse metodo carrega todos as entidaddes do BD, NAO É UMA BOA PRATICA, PQ PODEM
    // HAVER MILHARES DE REGISTROS.
    // O CORRETO É USAR UMA LISTA PAGINAVEL
    //
    //@GetMapping // mapeado para requisiçao http tipo get
    //public List<SellerDataList> listVendor(){
    //    return repository.findAll().stream().map(SellerDataList::new).toList();
    // }
    //*************************************************************************************




    //O METODO GET ABAIXO RETORNA PAGINAS COM CONTROLE DOS RESULTADOS
    //cada pagina terá até 10 objetos, e estao ordenados pelo atributo "nome" de forma crescente.
    @GetMapping
    public ResponseEntity<Page<SellerDataList>> listVendor(@PageableDefault(size=10,sort={"name"})Pageable page){
           var p =  repository.findAllByActiveTrue(page).map(SellerDataList::new);
           return ResponseEntity.ok(p);

    }
    //Este metodo busca um atributo na tabela, com valor true com mesmo nome declarado na função findAllByActiveTrue
    //-----------------------------------------------------
    //Get com id, requisita vendedor especifico
    @GetMapping("/{id}")
    public ResponseEntity datailer(@PathVariable Long id){
        var seller = repository.getReferenceById(id);
        return ResponseEntity.ok(new SellerUpdateDadaResponse(seller));
    }


    //-------------------------------------------------------

    @PutMapping
    @Transactional
    public ResponseEntity apdater(@RequestBody @Valid SellerUpdateData dados){
        var seller = repository.getReferenceById(dados.id());
        seller.updater(dados);
        return ResponseEntity.ok(new SellerUpdateDadaResponse(seller));
    }


    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){
        var seller = repository.getReferenceById(id);
        seller.deleter();
        return ResponseEntity.noContent().build();// o noContent cria um objeto e o build cria um objeto responseEntidy
    } // O retorno esperado desse metodo é um 204 vazio.






}
