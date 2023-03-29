public class Hypnotize extends SpecialAbility {
    String name = "Hypnotize";
    public static int attackUsed = 0;
    public static boolean hypnotizeUsed = false;
    
    public Hypnotize () {
    }
    
    public String getName () {
        return name;
    }
    
    public static String options() {
        return "Hypnotize (You can use 2 attacks in a row)";
    }
    
    public static void activate() {
        hypnotizeUsed = true;
    }
    
    public String toString() {
        return "";
    }
}