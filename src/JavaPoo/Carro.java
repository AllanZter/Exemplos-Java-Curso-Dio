 package JavaPoo;

public  class Carro extends Veiculo {

    
    public void ligar(){
        confereCambio(); //encapsolamento
        confereCombustivel();//encapsolamento
        System.out.println("Carro Ligado");
    }
    private void confereCombustivel(){
        System.out.println("conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("conferindo cambio");
    }
}