package br.com.alura.viacep;

public record Endereco(String cep,
                       String logradouro,
                       String complemento,
                       String localidade,
                       String uf) {

}
