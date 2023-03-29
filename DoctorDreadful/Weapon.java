public abstract class Weapon implements NamedThing {
    String name = "Weapon";
    final int damage = 0;
    int ammo = 0;
    int cooldown = 0;
    
    public abstract String toString();
}
    