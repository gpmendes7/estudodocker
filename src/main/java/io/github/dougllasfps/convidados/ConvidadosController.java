package io.github.dougllasfps.convidados;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ConvidadosController {

    @GetMapping
    public List<Convidado> getConvidados() {
        List<Convidado> lista = new ArrayList<>();
        lista.add(new Convidado("Fulano", "01234567899"));
        lista.add(new Convidado("Cicrano", "01234567899"));
        return lista;
    }

}
