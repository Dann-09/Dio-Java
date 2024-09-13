public class ResultadoEscolar {
    public static void main(String[] args) {
        
        // Usando a estrutura If, else if, else
        int nota = 6;
         if (nota > 7){
            System.out.println("Passou");

        }else if (nota >= 5 && nota <7) {
            System.out.println("Recuperação");
        }else 
            System.out.println("Não passou");
        
        // Usando as condições ternárias

        int nota2 = 2;

        String resultado = nota2 >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);




    }
}
