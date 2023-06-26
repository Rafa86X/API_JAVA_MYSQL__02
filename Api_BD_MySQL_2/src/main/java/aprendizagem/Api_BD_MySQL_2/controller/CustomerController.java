package aprendizagem.Api_BD_MySQL_2.controller;
import aprendizagem.Api_BD_MySQL_2.domain.customer.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity register(@RequestBody @Valid CustomerRegistrationData dados) {
        var p = repository.save(new Customer(dados));
        return ResponseEntity.ok(p);
    }

    @GetMapping
    public ResponseEntity<Page<CustomerDataList>> lister(@PageableDefault(size=10,sort={"name"}) Pageable page){
        var p =  repository.findAllByActiveTrue(page).map(CustomerDataList::new);
        return ResponseEntity.ok(p);
    }
    @GetMapping("/{id}")
    public ResponseEntity datailer(@PathVariable Long id){
        var d = repository.getReferenceById(id);
        return ResponseEntity.ok(new CustomerUpdateDataResponse(d));
    }
    @PutMapping
    @Transactional
    public ResponseEntity apdater(@RequestBody @Valid CustomerUpdadeData dados){
        var d = repository.getReferenceById(dados.id());
        d.updater(dados);
        return ResponseEntity.ok(new CustomerUpdateDataResponse(d));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){
        var dado = repository.getReferenceById(id);
        dado.deleter();
        return ResponseEntity.noContent().build();
    }
}


