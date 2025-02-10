public class Exo13 {

    public static void main(String[] args) {
        
        int a= 24;
        int b= 42;

        System.out.println("Avant l'échange : a = " + a + ", b = " + b);

        int x=a;
        a=b;
        b=x;

        System.out.println("Après l'échange : a = " + a + ", b = " + b);

    }
    
}
