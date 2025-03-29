package JavaPoo;

// Exercicio de Herança,Porlimorfismo, Abstração e encapsolamento de classes

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro(); // criando objeto
        Moto  Yamaha = new Moto();
        
        jeep.setChassi("8559");
        jeep.ligar(); // chamando metodo
        
        Yamaha.ligar();
        Yamaha.setChassi("2356");
    }
}
