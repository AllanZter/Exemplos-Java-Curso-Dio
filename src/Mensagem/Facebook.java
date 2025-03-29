package Mensagem;

class Facebook extends Mensagem {

    @Override
    public void enviarMensagem() {
        validar();
        System.out.println("Mensagem enviada pelo Facebook");
        salvar();       
    }

    
}