public class InvisiblePotion extends SpecialAbility {
    String name = "Invisible Potion";
    public static boolean potionUsed = false;
   
    public InvisiblePotion () {
    }
    
    public String getName () {
        return name;
    }
    
    public static String options() {
        return "Invisible Potion (You will take no Damage for the next Attack, Does not count as a Move)";
    }
    
    public static void activate() {
        potionUsed = true;
    }
    
    public String toString() {
        return "";
    }
}