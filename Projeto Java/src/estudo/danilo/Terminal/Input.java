package estudo.danilo.Terminal;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Criando o objeto de scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String name = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println(altura);
        System.out.println(name);
        System.out.println(sobrenome);



    }
}
