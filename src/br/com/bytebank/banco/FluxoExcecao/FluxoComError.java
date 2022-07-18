package javaPilha.src.br.com.bytebank.banco.FluxoExcecao;

public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) { // Ex é uma referencia
            String msg = ex.getMessage(); // Exibe uma mensagem junto da exception
            System.out.println("Exception " + msg);
            // ex.printStackTrace(); // Mostra o rastro da pilha
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        ;
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        metodo2();
        System.out.println("Fim do metodo2");
 
    }
}