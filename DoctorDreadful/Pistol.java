public class Pistol extends Weapon {
    String name = "Pistol";
    final int damage = 75;
    public static int ammo = 0;
    public static int cooldown = 0;
    
    public Pistol(int a) {
        ammo = a;
    }
    
    public String getName() {
        return name;
    }
    
    
    public static int getCoolDown() {
        return cooldown;
    }
    
    public static void setCoolDown() {
        cooldown = 1;
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
        return "Pistol Damage: 75 Cooldown: " + cooldown;
    }
    
    public String toString() {
        return "";
    }
}
    