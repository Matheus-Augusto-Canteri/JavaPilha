package javaPilha.src.br.com.bytebank.banco.FluxoExcecao;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception ex) { // Ex é uma referencia | Catch genérico
            String msg = ex.getMessage(); // Exibe uma mensagem junto da exception
            System.out.println("Exception " + msg);
            // ex.printStackTrace(); // Mostra a saida do fluxo
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao { // Colocar aqui na assinatura do método
        System.out.println("Ini do metodo2");

        throw new MinhaExcecao("Deu muita merda");

        // System.out.println("Fim do metodo2");
    }
}