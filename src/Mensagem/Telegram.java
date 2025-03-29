package Mensagem;

public class Telegram extends Mensagem {

    @Override
    public void enviarMensagem() {
        validar();
        System.out.println("Mensagem enviada pelo telegram");
    }
    
}
