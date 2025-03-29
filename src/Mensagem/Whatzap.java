package Mensagem;

public class Whatzap extends Mensagem {

    @Override
    public void enviarMensagem() {
        validar();
        System.out.println("Mensagem enviada pelo Whatzap");
    }
    
}
