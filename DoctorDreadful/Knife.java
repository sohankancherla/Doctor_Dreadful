public class Knife extends Weapon {
    String name = "Knife";
    final int damage = 40;
    int cooldown = 0;
    
    public Knife() {
        
    }
    
    public String getName() {
        return name;
    }
    
    public static String options() {
        return "Knife Damage: 40 Cooldown: 0";
    }
    
    public String toString() {
        return "";
    }
}
    