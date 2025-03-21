public class ExemploForArray {
    public static void main(String[] args) {
        //Exemplo Loop For em Arrays
        String alunos[] = {"FELIPE","JONAS","JULIA","MARCOS", "ALLAN"};

        for(int x=0; x<alunos.length; x++){
            // FORMA ABREVIADA PARA PERCORRE O ARRAY
            // PODERIA USAR FOR EACH "for(String aluno : alunos){}"
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);

        }
    }
}
