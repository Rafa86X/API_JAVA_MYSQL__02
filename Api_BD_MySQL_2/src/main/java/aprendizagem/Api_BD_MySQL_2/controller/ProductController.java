
package aprendizagem.Api_BD_MySQL_2.controller;
import aprendizagem.Api_BD_MySQL_2.domain.product.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

//	"description":"Bastão de madeira",
//	"price":10.25
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity register(@RequestBody @Valid ProductRegistrationData dados) {
        var p = repository.save(new Product(dados));
        return ResponseEntity.ok(p);
    }

    @GetMapping
    public ResponseEntity<Page<ProductUpdateDataResponse>> lister(@PageableDefault(size=10) Pageable page){
        var p =  repository.findAllByActiveTrue(page).map(ProductUpdateDataResponse::new);
        return ResponseEntity.ok(p);
    }
    @GetMapping("/{id}")
    public ResponseEntity datailer(@PathVariable Long id){
        var d = repository.getReferenceById(id);
        return ResponseEntity.ok(new ProductUpdateDataResponse(d));
    }
    @PutMapping
    @Transactional
    public ResponseEntity apdater(@RequestBody @Valid ProductUpdadeData dados){
        var d = repository.getReferenceById(dados.id());
        d.updater(dados);
        return ResponseEntity.ok(new ProductUpdateDataResponse(d));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){
        var dado = repository.getReferenceById(id);
        dado.deleter();
        return ResponseEntity.noContent().build();
    }
}
