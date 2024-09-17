import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // Chamar os métodos 
        selecaoCandidatos(); // Seleciona os candidatos
        imprimirSelecionados(); // Imprime os candidatos
        atender();
    }

    // metodo atender 
    static boolean atender(){
    return new Random().nextInt(3)==1;
    }

    static void entrarEmContato (String candidato){
       int tentativasRealizadas = 1; 
       boolean continuarTentando = true;
       boolean atendeu=false;
       do {
        atendeu = atender();
       } while (continuarTentando && tentativasRealizadas<3);
       if (continuarTentando) {
            tentativasRealizadas++;
       } else {
            System.out.println("Contato realizado com sucesso");
       }
    }


    // Usando o ThreadLocalRandom para gerar um número aleatório por candidato
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método seleção candidatos
    static void selecaoCandidatos(){
        // Array de candidatos
        String [] candidatos = {"danilo", "vitin", "dudu", "joazin", "lucas", "gangbeasts", "cr7"};

        // Variáveis
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        // Laço de repetição
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("Candidato " + candidato + " não selecionado.");
            }
            
            candidatoAtual++; // Incrementa o candidato atual para passar ao próximo
        }
    }

    // Método imprimirSelecionados
    static void imprimirSelecionados(){
        System.out.println("Imprimindo a lista de candidatos, informando o índice do elemento:");
        String [] candidatos = {"danilo", "vitin", "dudu", "joazin", "lucas", "gangbeasts", "cr7"};
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato nº " + (indice + 1) + " é " + candidatos[indice]);
        }
    }

    // Método analisar candidato
    public static void analisarCanditado(double salarioPretendido){
        // Salário base para oferecer
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {    
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta.");
        } else {
            System.out.println("Aguardando demais resultados.");
        }
    }
}
