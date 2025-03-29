package Mensagem;

public abstract class Mensagem {
    
    abstract void enviarMensagem();

    public void validar(){
        System.out.println("Validado na internet");
        
    }
    public void salvar(){
        System.out.println("Salvando mensagem");
    }
}
