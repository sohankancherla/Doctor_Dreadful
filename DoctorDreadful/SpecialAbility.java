public abstract class SpecialAbility implements NamedThing {
    String name = "SpecialAbility";
    static int specialAbilitiesUsed = 0;
    
    public abstract String toString();
    
    public static int getSpecialAbilitiesUsed() {
        return specialAbilitiesUsed;
    }
    
    public static void setSpecialAbilitiesUsed() {
        specialAbilitiesUsed++;
    }
    
    public static void setSpecialAbilitiesUsedZero() {
        specialAbilitiesUsed = 0;
    }
}
    