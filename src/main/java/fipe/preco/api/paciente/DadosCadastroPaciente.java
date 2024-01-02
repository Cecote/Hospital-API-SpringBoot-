package fipe.preco.api.paciente;

import fipe.preco.api.endereco.DadosCadastroEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String spf, DadosCadastroEndereco endereco) {
}
