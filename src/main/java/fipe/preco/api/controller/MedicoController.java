package fipe.preco.api.controller;

import fipe.preco.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @PostMapping
    public void cadastro(@RequestBody DadosCadastroMedico dadosCadastro){
        System.out.println(dadosCadastro);
    }
}
