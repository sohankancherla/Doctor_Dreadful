public class RocketLauncher extends Weapon {
    String name = "Rocket Launcher";
    final int damage = 250;
    public static int ammo = 0;
    public static int cooldown = 0;
    
    public RocketLauncher(int a) {
        ammo = a;
    }
    
    public String getName() {
        return name;
    }
    
    public static int getCoolDown() {
        return cooldown;
    }
    
    public static void setCoolDown() {
        cooldown = 5;
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
        return "Rocket Launcher Damage: 250 Cooldown: " + cooldown;
    }
    
    public String toString() {
        return "";
    }
}
    