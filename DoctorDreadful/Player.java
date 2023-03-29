public class Player extends Fighter {
    String name = " ";
    final int MAX_HEALTH = 1500;
    public static int health = 1500;
    public static boolean hasKnife = false;
    public static boolean hasPistol = false;
    public static boolean hasShotgun = false;
    public static boolean hasGrenades = false;
    public static boolean hasRocketLauncher = false;
    public static boolean hasLHP = false;
    public static boolean hasTornado = false;
    public static boolean hasInvisiblePotion = false;
    public static boolean hasHypnotize = false;

    public Player (String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public static int getHealth() {
        return health;
    }
    
    public void useWeapon(int p, int o) {
    }

    public void useSpecialAbility(int s) {
    }

    public void useHealthPotion(int h) {
    }

    public static String options() {
        int i = 1;
        String r1 = "";
        String r2 = "";
        String r3 = "";
        String r4 = "";
        String r5 = "";
        String r6 = "";
        String r7 = "";
        String r8 = "";
        
        if (Player.hasKnife == true) {
            r1 = i + ". Use " + Knife.options() + " (Enter k)\n";
            i++;
        }
        if (Player.hasPistol == true) {
            r2 = i + ". Use " + Pistol.options() + " (Enter p)\n";
            i++;
        }
        if (Player.hasShotgun == true) {
            r3 = i + ". Use " + Shotgun.options() + " (Enter s)\n";
            i++;
        }
        if (Player.hasGrenades == true) {
            r4 = i + ". Use " + Grenade.options() + " (Enter g)\n";
            i++;
        }
        if (Player.hasRocketLauncher == true) {
            r5 = i + ". Use " + RocketLauncher.options() + " (Enter r)\n";
            i++;
        }
        if (Player.hasTornado == true) {
            r6 = i + ". Use " + SummonTornado.options() + " (Enter t)\n";
            i++;
        }
        if (Player.hasInvisiblePotion == true) {
            r7 = i + ". Use " + InvisiblePotion.options() + " (Enter i)\n";
            i++;
        }
        if (Player.hasHypnotize == true) {
            r8 = i + ". Use " + Hypnotize.options() + " (Enter h)\n";
            i++;
        }
        return r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8 ;
    }
    
    public static void changeKnife() {
        hasKnife = true;
    }
    
    public static void changePistol() {
        hasPistol = true;
    }
    
    public static void changeShotgun() {
        hasShotgun = true;
    }
    
    public static void changeGrenades() {
        hasGrenades = true;
    }
    
    public static void changeRocketLauncher() {
        hasRocketLauncher = true;
    }
    
    public static void changeLHP() {
        hasLHP = true;
    }
    
    public static void changeTornado() {
        hasTornado = true;
    }
    
    public static void changeInvisiblePotion() {
        hasInvisiblePotion = true;
    }
    
    public static void changeHypnotize() {
        hasHypnotize = true;
    }
    
    public String toString() {
        return "";
    }
}

    