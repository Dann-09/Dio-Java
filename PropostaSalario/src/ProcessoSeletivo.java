import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {}

    static void imprimitSelecionados(){
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        String [] candidatos = {"danilo", "vitin", "dudu", "joazin", "lucas", "gangbeasts", "cr7"};
        for(int indice=0;indice < candidatos.length;indice++){
            System.out.println("O candidato de n " + (indice+1) + "é" + candidatos[indice]);
        }
    }


    static void selecaoCandidatos(){
        // Array de candidatos
        String [] candidatos = {"danilo", "vitin", "dudu", "joazin", "lucas", "gangbeasts", "cr7"};
        // Variaveis
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        // Laço de repetiçao
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " Solicitou este valor de salário "+ salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga ");
                candidatosSelecionados++;
            }else {
                System.out.println("Candidato " + candidato + "nao selecionado " );
            }
        }
    }

     static double valorPretendido(){
     return ThreadLocalRandom.current().nextDouble(1800, 2200);}

        // metodo 
    public static void analisarCanditado(double salarioPretendido){
        // Salario base para oferecer 
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido  ) {    
            System.out.println("Ligar para o canditado");
            
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");
        }else {
            System.out.println("Aguardando demais resultados");
        }
        // scan.close();
    }
}
