import java.util.concurrent.ThreadLocalRandom;


public class App {
    public static void main(String[] args) throws Exception {

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
