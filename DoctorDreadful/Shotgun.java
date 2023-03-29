public class Shotgun extends Weapon {
    String name = "Shotgun";
    final int damage = 125;
    public static int ammo = 0;
    public static int cooldown = 0;
    
    public Shotgun(int a) {
        ammo = a;
    }
    
    public String getName() {
        return name;
    }
    
    public static int getCoolDown() {
        return cooldown;
    }
    
    public static void setCoolDown() {
        cooldown = 2;
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
        return "Shotgun Damage: 125 Cooldown: " + cooldown;
    }
    
    public String toString() {
        return "";
    }
}
    