package Mensagem;

public class App {
    
    public static void main(String[] args) {
        
        Facebook book = new Facebook();
        Telegram telegram = new Telegram();
        Whatzap whatzap = new Whatzap();

        book.enviarMensagem();
        telegram.enviarMensagem();
        whatzap.enviarMensagem();
    }
}
