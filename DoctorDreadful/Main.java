import java.util.*;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main (String[] args) {
        String playerName;
        boolean drSabotageAlive = true;
        boolean playerAlive = true;
        int laneCount = 0;

        Scanner scan = new Scanner (System.in);

        System.out.println("What is your name? ");
        playerName = scan.nextLine();

        Fighter p1 = new Player (playerName);
        Fighter ds = new DoctorDreadful ();
        Fighter menace = new Menace ();
        Fighter slayer = new Slayer ();
        Fighter stealth = new Stealth ();
        Fighter venom = new Venom ();
        Fighter shadow = new Shadow ();

        System.out.println();

        System.out.println("Welcome Agent " + playerName);
        try {
            Thread.sleep(2000);
        } 
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("We have kept an eye on Doctor Dreaful and found out he has been creating a bomb capable of vanishing life on Earth");
        try {
            Thread.sleep(4000);
        } 
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Your mission is to " +
            "defeat Doctor Dreadful and his guards to safely bring back Doctor Dreadful's bomb");
        try {
            Thread.sleep(4000);
        } 
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println();
        
        System.out.println("1 Day Later");
        try {
            Thread.sleep(4000);
        } 
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.print("You are now entering Dreadful Industries");
        try {
            Thread.sleep(4000);
        } 
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println();
        int lanePicked;

        boolean isMenaceAlive = true;
        boolean isSlayerAlive = true;
        boolean isStealthAlive = true;
        boolean isCorpseAlive = true;
        boolean isShadowAlive = true;

        while (laneCount < 5) {
            System.out.println();
            boolean done = false;
            int random = ((int)(Math.random()*4)+ 2);
            System.out.print("Pick a Lane (1-" + random + "): ");
            lanePicked = scan.nextInt();
            while (done == false) {
                int itemFound = ((int)(Math.random()*100)+ 1);
                if (lanePicked > random) {
                    System.out.println("Enter valid Number");
                    done = true;
                }
                else if (itemFound <= 25) {
                    if (Player.hasKnife == false) {
                        Player.changeKnife();
                        Knife knife = new Knife ();
                        System.out.println("You Found a Knife (40 Damage)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 45 && itemFound >= 26) {
                    if (Player.hasPistol == false) {
                        Player.changePistol();
                        int ammo = ((int)(Math.random()*51)+ 50);
                        Pistol pistol = new Pistol (ammo);
                        System.out.println("You Found a Pistol (75 Dammage)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 60 && itemFound >= 46) {
                    if (Player.hasShotgun == false) {
                        Player.changeShotgun();
                        int ammo = ((int)(Math.random()*11)+ 20);
                        Shotgun shotgun = new Shotgun (ammo);
                        System.out.println("You Found a Shotgun (125 Dammage, 1 Move Cooldown)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 70 && itemFound >= 61) {
                    if (Player.hasGrenades == false) {
                        Player.changeGrenades();
                        int ammo = ((int)(Math.random()*11)+ 10);
                        Grenade grenades = new Grenade (ammo);
                        System.out.println("You Found Grenades (150 Dammage, 1 Move Cooldown)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 75 && itemFound >= 71) {
                    if (Player.hasRocketLauncher == false) {
                        Player.changeRocketLauncher();
                        int ammo = ((int)(Math.random()*6)+ 1);
                        RocketLauncher rpg = new RocketLauncher (ammo);
                        System.out.println("You Found a Rocket Launcher (250 Dammage, 2 Move Cooldown)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 90 && itemFound >= 76 ) {
                    if (Player.hasLHP == false) {
                        Player.changeLHP();
                        LargeHealthPotion lhp = new LargeHealthPotion ();
                        int ammo = ((int)(Math.random()*3)+ 3);
                        System.out.println("You Found " + ammo + " Health Potion(s) (1000 Health)");
                        LargeHealthPotion.count = ammo;
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 96 && itemFound >= 91) {
                    if (Player.hasTornado == false) {
                        Player.changeTornado();
                        SummonTornado st = new SummonTornado ();
                        System.out.println("You Found a Tornado (400 Damage)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 98 && itemFound >= 97) {
                    if (Player.hasInvisiblePotion == false) {
                        Player.changeInvisiblePotion();
                        InvisiblePotion ip = new InvisiblePotion ();
                        System.out.println("You Found an Invisible Potion (Invincible for Opponent's next 2 attacks)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 100 && itemFound >= 99) {
                    if (Player.hasHypnotize == false) {
                        Player.changeHypnotize();
                        Hypnotize h = new Hypnotize ();
                        System.out.println("You Found Hypnotize Ability (Gives you the ability to do 2 attacks in a row)");
                        laneCount++;
                        done = true;
                    }
                }
            }
        }

        while (drSabotageAlive == true && playerAlive == true) {
            System.out.println();
            boolean done = false;
            int random = ((int)(Math.random()*4)+ 2);
            System.out.print("Pick a Lane (1-" + random + "): ");
            lanePicked = scan.nextInt();
            while (done == false) {
                int itemFound = ((int)(Math.random()*100)+ 1);
                if (lanePicked > random) {
                    System.out.println("Enter valid Number");
                    done = true;
                }
                else if (itemFound <= 15) {
                    if (Player.hasKnife == false) {
                        Player.changeKnife();
                        Knife knife = new Knife ();
                        System.out.println("You Found a Knife (40 Dammage)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 22 && itemFound >= 16) {
                    if (Player. hasPistol == false) {
                        Player.changePistol();;
                        int ammo = ((int)(Math.random()*51)+ 50);
                        Pistol pistol = new Pistol (ammo);
                        System.out.println("You Found a Pistol (75 Dammage, 1 Move Cooldown)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 30 && itemFound >= 23) {
                    if (Player.hasShotgun == false) {
                        Player.changeShotgun();
                        int ammo = ((int)(Math.random()*11)+ 20);
                        Shotgun shotgun = new Shotgun (ammo);
                        System.out.println("You Found a Shotgun (125 Dammage, 2 Move Cooldown)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 35 && itemFound >= 31) {
                    if (Player.hasGrenades == false) {
                        Player.changeGrenades();
                        int ammo = ((int)(Math.random()*11)+ 10);
                        Grenade grenades = new Grenade (ammo);
                        System.out.println("You Found Grenades (150 Dammage, 3 Move Cooldown)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 40 && itemFound >= 36) {
                    if (Player.hasRocketLauncher == false) {
                        Player.changeRocketLauncher();
                        int ammo = ((int)(Math.random()*6)+ 1);
                        RocketLauncher rpg = new RocketLauncher (ammo);
                        System.out.println("You Found a Rocket Launcher (250 Dammage, 5 Move Cooldown)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 60 && itemFound >= 41) {
                    if (Player.hasLHP == false) {
                        Player.changeLHP();
                        LargeHealthPotion lhp = new LargeHealthPotion ();
                        int ammo = ((int)(Math.random()*3)+ 3);
                        System.out.println("You Found " + ammo + " Health Potion(s) (1500 Health)");
                        LargeHealthPotion.count = ammo;
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 65 && itemFound >= 61) {
                    if (Player.hasTornado == false) {
                        Player.changeTornado();
                        SummonTornado st = new SummonTornado ();
                        System.out.println("You Found a Tornado (400 Damage)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 68 && itemFound >= 66 ) {
                    if (Player.hasInvisiblePotion == false) {
                        Player.changeInvisiblePotion();
                        InvisiblePotion ip = new InvisiblePotion ();
                        System.out.println("You Found an Invisible Potion (Invincible for Opponent's next 2 attacks)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 70 && itemFound >= 69 ) {
                    if (Player.hasHypnotize == false) {
                        Player.changeHypnotize();
                        Hypnotize h = new Hypnotize ();
                        System.out.println("You Found Hypnotize Ability (Gives you the ability to do 2 attacks in a row)");
                        laneCount++;
                        done = true;
                    }
                }
                else if (itemFound <= 78 && itemFound >= 71) {
                    if (isMenaceAlive == true) {
                        System.out.println("You have found Menace prepare for Battle");
                        
                        int menaceFight = Fight.fight(menace);
                        if (menaceFight == 0){
                            System.out.println("Game Over");
                            playerAlive = false;
                            System.exit(0);
                            done = false;
                        }
                        else if (menaceFight == 1){
                            done = true;
                            isMenaceAlive = false;
                        }

                    }
                }
                else if (itemFound <= 85 && itemFound >= 79) {
                    if (isSlayerAlive == true) {
                        System.out.println("You have found Slayer prepare for Battle");
                        
                        int slayerFight = Fight.fight(slayer);
                        if (slayerFight == 0){
                            done = false;
                            System.out.println("Game Over");
                            playerAlive = false;
                            System.exit(0);
                        }
                        if (slayerFight == 1){
                            done = true;
                            isSlayerAlive = false;
                        }

                    }
                }
                else if (itemFound <= 90 && itemFound >= 86) {
                    if (isStealthAlive == true) {
                        System.out.println("You have found Stealth prepare for Battle");
                        
                        int stealthFight = Fight.fight(stealth);
                        if (stealthFight == 0){
                            done = false;
                            System.out.println("Game Over");
                            playerAlive = false;
                            System.exit(0);
                        }
                        if (stealthFight == 1){
                            done = true;
                            isStealthAlive = false;
                        }

                    }
                }
                else if (itemFound <= 94 && itemFound >= 91) {
                    if (isCorpseAlive == true) {
                        System.out.println("You have found Venom prepare for Battle");
                        
                        int corpseFight = Fight.fight(venom);
                        if (corpseFight == 0){
                            done = false;
                            System.out.println("Game Over");
                            playerAlive = false;
                            System.exit(0);
                        }
                        if (corpseFight == 1){
                            done = true;
                            isCorpseAlive = false;
                        }

                    }
                }
                else if (itemFound <= 97 && itemFound >= 95) {
                    if (isShadowAlive == true) {
                        System.out.println("You have found Shadow prepare for Battle");
                        
                        int shadowFight = Fight.fight(shadow);
                        if (shadowFight == 0){
                            done = false;
                            System.out.println("Game Over");
                            playerAlive = false;
                            System.exit(0);
                        }
                        if (shadowFight == 1){
                            done = true;
                            isShadowAlive = false;
                        }

                    }
                }
                else if (itemFound <= 100 && itemFound >= 98) {
                    if (isSlayerAlive == false && isMenaceAlive == false && isStealthAlive == false && isCorpseAlive == false && isShadowAlive == false) {
                        System.out.println("You have found Doctor Dreadful! You must defeat to save mankind!");
                        
                        int dsFight = Fight.fight(ds);
                        if (dsFight == 0){
                            done = false;
                            System.out.println("Game Over");
                            playerAlive = false;
                            System.exit(0);
                        }
                        if (dsFight == 1){
                            done = true;
                            drSabotageAlive = false;
                            System.out.println("Congratulations, you have saved mankind from extinction.");
                            System.exit(0);
                        }

                    }
                }
            }
        }
    }
}

 