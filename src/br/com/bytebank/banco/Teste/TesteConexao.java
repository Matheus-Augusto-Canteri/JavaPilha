package javaPilha.src.br.com.bytebank.banco.Teste;

import javaPilha.src.br.com.bytebank.banco.Modelo.Conexao;

public class TesteConexao {

    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex){
            System.out.println("Deu merda na conexão");
        }

        // ---------------------------------------------------------

        /*Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu merda na conexão");
        } finally {
            con.close(); 
        }*/
    }

}
