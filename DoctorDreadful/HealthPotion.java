public abstract class HealthPotion implements NamedThing {
    String name = "Potion";
    final int health = 0;
    int count = 0;
    
    public abstract String usePotion();
    
    public abstract String toString();
}
    