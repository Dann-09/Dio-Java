import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Criando a classe Scanner
        Scanner lerDados = new Scanner(System.in).useLocale(Locale.US);

        // Coleta o número da conta
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = lerDados.nextInt();

        // Coleta o número da agência
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = lerDados.next();

        // Coleta o nome do cliente
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = lerDados.next();

        // Coleta o saldo do cliente
        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = lerDados.nextDouble();
        
        // Exibe a mensagem final ao usuário
        System.out.println("Olá " + nomeCliente + "," + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," +  "conta " +  numero + " e seu saldo "+ saldo + " já está disponível para saque");

        // Fecha o Scanner
        lerDados.close();








    }
}
