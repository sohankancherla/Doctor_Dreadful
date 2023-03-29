
public abstract class Fighter implements NamedThing {
    String name = "Fighter";
    final int MAX_HEALTH = 0;
    public static int health = 0;

    public abstract void useWeapon(int p, int o); 

    public abstract void useSpecialAbility(int s);

    public abstract void useHealthPotion(int h); 
    
}