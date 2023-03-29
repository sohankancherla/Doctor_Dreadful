public class SummonTornado extends SpecialAbility {
    String name = "Summon Tornado";
    final int damage = 400;
    public static int used = 0;
   
    public SummonTornado () {
    }
    
    public String getName () {
        return name;
    }
    
    public static String options() {
        return "Tornado (400 Damage to opponent)";
    }
    
    public String toString() {
        return "";
    }
}