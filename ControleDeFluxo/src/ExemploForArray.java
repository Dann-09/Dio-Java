public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "JULIA", "MARCOS" };

        // for (int x=0; x<alunos.length; x++){
        // System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);} 

        // Utilizando o for each em arrays
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }

    }
}
