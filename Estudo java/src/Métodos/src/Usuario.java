public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? "+ smartTv.ligada);
        System.out.println("Qual canal está? " + smartTv.canal);
        System.out.println("Qual o volume atual? "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada? "+ smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Qual o volume atual? "+ smartTv.volume);

        while (smartTv.volume < 101) {
            smartTv.aumentarVolume();
            System.out.println(smartTv.volume);
        
        }
        
        
        
}
}
