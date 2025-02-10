import java.util.Random;

public class Exo9 {

    public static void main(String[] args) {
    
        Random rand = new Random();  
        int randomNumber = rand.nextInt(42) + 1;

        if(randomNumber==42)
        {
            String message=String.format("Le nombre generer est %d",randomNumber);
            System.out.println(message);
            System.out.println("true");
        }else{
            String message=String.format("Le nombre generer est %d",randomNumber);
            System.out.println(message);

            System.out.println("false");        }
    }
    
}
