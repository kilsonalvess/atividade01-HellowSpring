package br.edu.ifpb.progdist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloSpringController {
    @GetMapping("/hello")
    public String Hello (){
        return " HELLO KILSON ALVES DOS SANTOS LEITAO";


    }


}
