import java.util.Scanner;

public class Exemplo_If_Else {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do Aluno:");
        int Nota = scanner.nextInt();

        if(Nota >= 6){
            System.out.println("Aluno Aprovado: Nota  " + Nota);
        }
        else{
            System.out.println("Aluno Reprovado: Nota  " + Nota);
        }



        scanner.close();
    }
}
