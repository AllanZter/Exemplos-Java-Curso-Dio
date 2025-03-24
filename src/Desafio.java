import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salario:");
        float valorSalario = scanner.nextFloat();
        System.out.println("Digite o valor dos Beneficios:");
        float valorBeneficios = scanner.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05F * valorSalario;
            System.out.println("Imposto: " + valorImposto);
        }
        else if(valorSalario >= 1100.01 && valorSalario <= 2500.00){
            valorImposto = 0.10F * valorSalario;
            System.out.println( "Imposto: "  + valorImposto);
        }
        else{
            valorImposto = 0.15F * valorSalario;
            System.out.println("Imposto: " + valorImposto);
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));


        scanner.close();
    }
}