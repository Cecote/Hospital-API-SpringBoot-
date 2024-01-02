package fipe.preco.api.controller;

import fipe.preco.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @PostMapping
    public void cadastroPacientes (@RequestBody DadosCadastroPaciente dadosCadastro){
        System.out.println(dadosCadastro);
    }
}
