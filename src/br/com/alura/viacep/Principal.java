package br.com.alura.viacep;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de CEP para consulta: ");
        var cep = scanner.nextLine();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaArquivoJson(novoEndereco);
        } catch (RuntimeException | IOException e ){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
