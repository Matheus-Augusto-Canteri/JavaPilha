package javaPilha.src.br.com.bytebank.banco.Teste;

import javaPilha.src.br.com.bytebank.banco.FluxoExcecao.MinhaExcecao;
import javaPilha.src.br.com.bytebank.banco.Modelo.Conta;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();
        } catch (MinhaExcecao ex) {
            System.out.println("Tratamento!...");
        }

    }
}
