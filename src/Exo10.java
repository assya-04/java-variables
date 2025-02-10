public class Exo10 {
    public static void main(String[] args) {
        
        Boolean my42TypeBoolean = true;         // pour boolean
        Byte my42TypeByte = 42;                 // pour byte
        Short my42TypeShort = 42;               // pour short
        Integer my42TypeInt = 42;               // pour int
        Long my42TypeLong = 42L;                // pour long
        Float my42TypeFloat = 42.0f;            // pour float
        Double my42TypeDouble = 42.0;           // pour double
        Character my42TypeChar = 'A';           // pour char
        String my42TypeString = "quarante-deux"; // Type String
        Object my42TypeObject = new Object();   // Type Object (référence)
        
    //Affichage    
        System.out.println("Type de my42TypeBoolean : " + my42TypeBoolean.getClass().getName());
        System.out.println("Type de my42TypeByte : " + my42TypeByte.getClass().getName());
        System.out.println("Type de my42TypeShort : " + my42TypeShort.getClass().getName());
        System.out.println("Type de my42TypeInt : " + my42TypeInt.getClass().getName());
        System.out.println("Type de my42TypeLong : " + my42TypeLong.getClass().getName());
        System.out.println("Type de my42TypeFloat : " + my42TypeFloat.getClass().getName());
        System.out.println("Type de my42TypeDouble : " + my42TypeDouble.getClass().getName());
        System.out.println("Type de my42TypeChar : " + my42TypeChar.getClass().getName());
        System.out.println("Type de my42TypeString : " + my42TypeString.getClass().getName());
        System.out.println("Type de my42TypeObject : " + my42TypeObject.getClass().getName());
    }
}
