package aprendizagem.Api_BD_MySQL_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellou")
public class helloController {

    @GetMapping
    public String helloou(){
        return "Deu certo, helouuu!";
    }
}
