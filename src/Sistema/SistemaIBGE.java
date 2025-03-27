package Sistema;

import java.util.Scanner;

public class SistemaIBGE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista dos 27 Estados Brasileiros:");
        for (EstadosBR e: EstadosBR.values()){            
            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());            
        }
        
        System.out.println("Qual dos Estados acima você faz parte?");
        String estado = scanner.nextLine();
        System.out.println("você faz parte do estado do : " + estado);


        scanner.close();
    }
}
