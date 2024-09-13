public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "M";

        switch (plano) {
            case "T":{
                System.out.println("5GB YouTube");
                // break; Se não colocar o break ele pegará os demais valores e incluirá 
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
                // break;
            }
            case "B":{
                System.out.println("100 minutos ligação");
                // break;
            }
                
        
            default:
                break;
        }


    }
}
