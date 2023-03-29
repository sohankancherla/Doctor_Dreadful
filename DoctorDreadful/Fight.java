import java.util.*;
public class Fight {
    Scanner scan = new Scanner (System.in);
    static String answer = "";
    public static int enemyHealth = 0;
    public static int done = 0;
    public static int ipUsed = 0;
    public Fight () {   
    }

    public static int fight (Fighter f) {
        Scanner scan = new Scanner (System.in);
        String answer = "";
        if (f instanceof DoctorDreadful) {
            enemyHealth = DoctorDreadful.getHealth();
        }
        if (f instanceof Menace) {
            enemyHealth = Menace.getHealth();
        }
        if (f instanceof Slayer) {
            enemyHealth = Slayer.getHealth();
        }
        if (f instanceof Stealth) {
            enemyHealth = Stealth.getHealth();
        }
        if (f instanceof Venom) {
            enemyHealth = Venom.getHealth();
        }
        if (f instanceof Shadow) {
            enemyHealth = Shadow.getHealth();
        }

        Shotgun.setCoolDown0();
        Grenade.setCoolDown0();
        RocketLauncher.setCoolDown0();
        SpecialAbility.setSpecialAbilitiesUsedZero(); 
        SummonTornado.used = 0;
        InvisiblePotion.potionUsed = false;
        Hypnotize.attackUsed = 0;
        Hypnotize.hypnotizeUsed = false;

        while ((Player.health >= 0) && (enemyHealth >= 0)) {
            System.out.println();
            System.out.println(Player.options());
            while( 100 > 1) {
	            System.out.print("What would you like to do: ");
	            answer = scan.nextLine();
	            if (answer.equalsIgnoreCase("k") && Player.hasKnife) {
	                if (Player.hasKnife == false) {
	                    System.out.println("You don't have a Knife");
	                    continue;
	                }
	                enemyHealth -= 40;
	                Pistol.reduceCoolDown();
	                Shotgun.reduceCoolDown();
	                Grenade.reduceCoolDown();
	                RocketLauncher.reduceCoolDown();
	                System.out.println("You stabbed the enemy. Enemy health: " + enemyHealth);
	                if (Hypnotize.hypnotizeUsed == true) {
	                    Hypnotize.attackUsed++;
	                }
	                done++;
	                break;
	            }
	            if (answer.equalsIgnoreCase("p") && Player.hasPistol) {
	                if (Player.hasPistol == false) {
	                    System.out.println("You don't have a Pistol");
	                    continue;
	                }
	                if (Pistol.cooldown != 0) {
	                    System.out.println("The cooldown for Pistol is not over yet");
	                    continue;
	                }
	                enemyHealth -= 75;
	                Pistol.reduceCoolDown();
	                Shotgun.reduceCoolDown();
	                Grenade.reduceCoolDown();
	                RocketLauncher.reduceCoolDown();
	                System.out.println("You shot the enemy. Enemy health: " + enemyHealth);
	                Pistol.setCoolDown();
	                if (Hypnotize.hypnotizeUsed == true) {
	                    Hypnotize.attackUsed++;
	                }
	                done++;
	                break;
	            }
	            if (answer.equalsIgnoreCase("s") && Player.hasShotgun) {
	                if (Player.hasShotgun == false) {
	                    System.out.println("You don't have a Shotgun");
	                    continue;
	                }
	                if (Shotgun.cooldown != 0) {
	                    System.out.println("The cooldown for Shotgun is not over yet");
	                    continue;
	                }
	                enemyHealth -= 125;
	                Pistol.reduceCoolDown();
	                Shotgun.reduceCoolDown();
	                Grenade.reduceCoolDown();
	                RocketLauncher.reduceCoolDown();
	                System.out.println("You shot the enemy. Enemy health: " + enemyHealth);
	                Shotgun.setCoolDown();
	                if (Hypnotize.hypnotizeUsed == true) {
	                    Hypnotize.attackUsed++;
	                }
	                done++;
	                break;
	            }
	            if (answer.equalsIgnoreCase("g") && Player.hasGrenades) {
	                if (Player.hasGrenades == false) {
	                    System.out.println("You don't have Grenades");
	                    continue;
	                }
	                if (Grenade.cooldown != 0) {
	                    System.out.println("The cooldown for Grenades is not over yet");
	                    continue;
	                }
	                enemyHealth -= 150;
	                Pistol.reduceCoolDown();
	                Shotgun.reduceCoolDown();
	                Grenade.reduceCoolDown();
	                RocketLauncher.reduceCoolDown();
	                System.out.println("You exploded the enemy. Enemy health: " + enemyHealth);
	                Grenade.setCoolDown();
	                if (Hypnotize.hypnotizeUsed == true) {
	                    Hypnotize.attackUsed++;
	                }
	                done++;
	                break;
	            }
	            if (answer.equalsIgnoreCase("r") && Player.hasRocketLauncher) {
	                if (Player.hasRocketLauncher == false) {
	                    System.out.println("You don't have a RocketLauncher");
	                    continue;
	                }
	                if (RocketLauncher.cooldown != 0) {
	                    System.out.println("The cooldown for Rocket Launcher is not over yet");
	                    continue;
	                }
	                enemyHealth -= 250;
	                Pistol.reduceCoolDown();
	                Shotgun.reduceCoolDown();
	                Grenade.reduceCoolDown();
	                RocketLauncher.reduceCoolDown();
	                System.out.println("You hit the enemy. Enemy health: " + enemyHealth);
	                RocketLauncher.setCoolDown();
	                if (Hypnotize.hypnotizeUsed == true) {
	                    Hypnotize.attackUsed++;
	                }
	                done++;
	                break;
	            }
	            if (answer.equalsIgnoreCase("t") && Player.hasTornado) {
	                if ( SpecialAbility.getSpecialAbilitiesUsed() == 2) {
	                    System.out.println("You already used 2 Special Abilities this Battle");
	                    continue;
	                }
	                if (SummonTornado.used == 1) {
	                    System.out.println("You already summoned Tornado");
	                    continue;
	                }
	                enemyHealth -= 400;
	                Pistol.reduceCoolDown();
	                Shotgun.reduceCoolDown();
	                Grenade.reduceCoolDown();
	                RocketLauncher.reduceCoolDown();
	                SummonTornado.used++;
	                System.out.println("You tornadoed the enemy. Enemy health: " + enemyHealth);
	                SpecialAbility.setSpecialAbilitiesUsed();
	                if (Hypnotize.hypnotizeUsed == true) {
	                    Hypnotize.attackUsed++;
	                }
	                done++;
	                break;
	            }
	            if (answer.equalsIgnoreCase("i") && Player.hasInvisiblePotion) {
	                if ( SpecialAbility.getSpecialAbilitiesUsed() == 2) {
	                    System.out.println("You already used 2 Special Abilities this Battle");
	                    continue;
	                }
	                System.out.println("You activated Invisible Potion");
	                InvisiblePotion.activate();
	                SpecialAbility.setSpecialAbilitiesUsed();
	                if (Hypnotize.hypnotizeUsed == true) {
	                    Hypnotize.attackUsed++;
	                }
	                break;
	            }
	            if (answer.equalsIgnoreCase("h") && Player.hasHypnotize) {
	                if (Hypnotize.hypnotizeUsed == true) {
	                    System.out.println("You already used Hypnotize");
	                    continue;
	                }
	                if ( SpecialAbility.getSpecialAbilitiesUsed() == 2) {
	                    System.out.println("You already used 2 Special Abilities this Battle");
	                    continue;
	                }
	                System.out.println("You hypnotized the enemy.");
	                Hypnotize.activate();
	                SpecialAbility.setSpecialAbilitiesUsed();
	                done++;
	                break;
	            }
		        else {
		        	System.out.println("Enter valid move");
		        }
	         }
	            int cpuAttack = ((int)(Math.random()*100)+ 1); 
	            if (Hypnotize.hypnotizeUsed == true && Hypnotize.attackUsed < 2) {
	                cpuAttack = 1000;
	            }
	            if (InvisiblePotion.potionUsed == true && ipUsed < 2) {
	                cpuAttack = 1000;
	                ipUsed++;
	            }
	            if (cpuAttack <= 25) {
	                if (InvisiblePotion.potionUsed == true) {
	                    InvisiblePotion.potionUsed = false;
	                }
	                else {
	                    Player.health -= 40;
	                }
	                System.out.println("Enemy used Knife. Your Health: " + Player.health);
	            }
	            if (cpuAttack <= 40 && cpuAttack >= 26) {
	                if (InvisiblePotion.potionUsed == true) {
	                    InvisiblePotion.potionUsed = false;
	                }
	                else {
	                    Player.health -= 75;
	                }
	                System.out.println("Enemy used Pistol. Your Health: " + Player.health);
	            } 
	            if (cpuAttack <= 70 && cpuAttack >= 41) {
	                if (InvisiblePotion.potionUsed == true) {
	                    InvisiblePotion.potionUsed = false;
	                }
	                else {
	                    Player.health -= 125;
	                }
	                System.out.println("Enemy used Shotgun. Your Health: " + Player.health);
	            } 
	            if (cpuAttack <= 85 && cpuAttack >= 71) {
	                if (InvisiblePotion.potionUsed == true) {
	                    InvisiblePotion.potionUsed = false;
	                }
	                else {
	                    Player.health -= 150;
	                }
	                System.out.println("Enemy used a Grenade. Your Health: " + Player.health);
	            } 
	            if (cpuAttack <= 95 && cpuAttack >= 86) {
	                if (InvisiblePotion.potionUsed == true) {
	                    InvisiblePotion.potionUsed = false;
	                }
	                else {
	                    Player.health -= 250;
	                }
	                System.out.println("Enemy used Rocket Launcher. Your Health: " + Player.health);
	            } 
	            if (cpuAttack <= 100 && cpuAttack >= 96) {
	                if (InvisiblePotion.potionUsed == true) {
	                    InvisiblePotion.potionUsed = false;
	                }
	                else {
	                    Player.health -= 400;
	                }
	                System.out.println("Enemy summoned a Tornado. Your Health: " + Player.health);
	            } 
    	}
        if (Player.health <= 0){
            done++;
            System.out.println("You were Defeated");
            return 0;
        }
        else {
            done++;
            System.out.println( "You Deafeated " + f.getName());
            if (LargeHealthPotion.count > 0 && Player.health != 1500) {
                String answer2 = "";
                System.out.print("\nWould you like to use a Health Potion (Y or N): ");
                answer2 = scan.nextLine();
                if (answer2.equalsIgnoreCase("y")) {
                    LargeHealthPotion.count--;
                    Player.health = 1500;
                }
            }
            return 1;
        }
    }

    public  String toString() {
        return "";
    }
}