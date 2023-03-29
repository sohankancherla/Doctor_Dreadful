public class Grenade extends Weapon {
    String name = "Grenade";
    final int damage = 150;
    public static int ammo = 0;
    public static int cooldown = 0;
    
    public Grenade(int a) {
        ammo = a;
    }
    
    public String getName() {
        return name;
    }
    
    public static int getCoolDown() {
        return cooldown;
    }
    
    public static void setCoolDown() {
        cooldown = 3;
    }
    
    public static void setCoolDown0() {
        cooldown = 0;
    }
    
    public static void reduceCoolDown() {
        if (cooldown != 0) {
            cooldown--;
        }
    }
    
    public static String options() {
        return "Grenade Damage: 150 Cooldown: " + cooldown;
    }
    
    public String toString() {
        return "";
    }
}
    