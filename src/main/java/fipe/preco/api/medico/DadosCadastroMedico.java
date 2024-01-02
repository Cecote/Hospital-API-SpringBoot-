package fipe.preco.api.medico;

import fipe.preco.api.endereco.DadosCadastroEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosCadastroEndereco endereco) {
}
