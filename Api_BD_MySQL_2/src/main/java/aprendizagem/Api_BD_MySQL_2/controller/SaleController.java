package aprendizagem.Api_BD_MySQL_2.controller;
import aprendizagem.Api_BD_MySQL_2.domain.sale.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sale")
public class SaleController {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SaleRepositoryView repositoryV;

    @PostMapping
    @Transactional
    public ResponseEntity register(@RequestBody @Valid SaleRegistrationData dados) {
        var p = repository.save(new Sale(dados));
        return ResponseEntity.ok(p);
    }

    @GetMapping
    public ResponseEntity<Page<SaleUpdateDataResponseView>> lister(@PageableDefault(size=10) Pageable page){
        var p =  repositoryV.findAll(page).map(SaleUpdateDataResponseView::new);
        return ResponseEntity.ok(p);
    }
    @GetMapping("/{id}")
    public ResponseEntity datailer(@PathVariable Long id){
        var d = repositoryV.getReferenceById(id);

        return ResponseEntity.ok(new SaleUpdateDataResponseView(d));

    }
    @PutMapping
    @Transactional
    public ResponseEntity apdater(@RequestBody @Valid SaleUpdadeData dados){
        var d = repository.getReferenceById(dados.id());
        d.updater(dados);
        return ResponseEntity.ok(new SaleUpdateDataResponse(d));
    }

}


