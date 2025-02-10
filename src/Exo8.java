public class Exo8 {

    public static void main(String[] args) {
        
        char [] myArray42 = {'q', 'u', 'a', 'r', 'a', 'n', 't', 'e', '-', 'd', 'e', 'u', 'x'};

        String maString = String.valueOf(myArray42);
        String maChaine= "La grande réponse sur la vie, l’univers et le reste !";
        
        String result=String.format("%s %s",maString , maChaine);

        System.out.println(result);
    }
    
}