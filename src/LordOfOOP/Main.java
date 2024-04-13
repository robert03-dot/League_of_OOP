package LordOfOOP;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rounds
        String[] roundInput = scanner.nextLine().split(" ");
        int rounds = Integer.parseInt(roundInput[1]);

        // Skip the empty line
        scanner.nextLine();

        // Read the number of heroes
        int heroCount = Integer.parseInt(scanner.nextLine());

        // Create an ArrayList to store heroes
        ArrayList<Heroes> heroes = new ArrayList<>();
        for (int i = 0; i < heroCount; i++) {
            // Read hero data
            String[] heroData = scanner.nextLine().split(" ");
            char heroType = heroData[0].charAt(0);
            int x = Integer.parseInt(heroData[1]);
            int y = Integer.parseInt(heroData[2]);
            // Create and add hero objects based on their type
            switch (heroType) {
                case 'K':
                    heroes.add(new Knight(x, y));
                    break;
                case 'W':
                    heroes.add(new Wizard(x, y));
                    break;
                case 'P':
                    heroes.add(new Pyromancer(x, y));
                    break;
                case 'R':
                    heroes.add(new Rogue(x, y));
                    break;
            }
        }

        // Create instances of Abilities and heroes with initial coordinates
        Abilities abilitiesInstance = new Abilities();
        Knight knightInstance = new Knight(0, 0);
        Pyromancer pyromancerInstance = new Pyromancer(0, 0);
        Rogue rogueInstance = new Rogue(0, 0);
        Wizard wizardInstance = new Wizard(0, 0);

        // Read the number of angels
        int angelCount = Integer.parseInt(scanner.nextLine());

        // Create an ArrayList to store angels
        ArrayList<Angels> angels = new ArrayList<>();
        for (int i = 0; i < angelCount; i++) {
            // Read angel data
            String[] angelData = scanner.nextLine().split(" ");
            int round = Integer.parseInt(angelData[0]);
            String[] angelInfo = angelData[1].split(",");
            String angelType = angelInfo[0];
            int X = Integer.parseInt(angelInfo[1]);
            int Y = Integer.parseInt(angelInfo[2]);
            // Create and add angel objects
            angels.add(new Angels(round, angelType, X, Y));
        }

        // Simulate rounds
        for (int currentRound = 1; currentRound <= rounds; currentRound++) {
            System.out.println("~~ Round " + currentRound + " ~~");
            // Iterate through angels
            for (Angels angel : angels) {
                // If the angel is spawned in the current round
                if (angel.getRound() == currentRound) {
                    System.out.println("Angel " + angel.getType() + " was spawned at " + angel.getX() + " " + angel.getY());
                    // Iterate through heroes
                    for (Heroes hero : heroes) {
                        // If hero and angel are at the same coordinates
                        if (hero.getX() == angel.getX() && hero.getY() == angel.getY()) {
                            // Apply angel's effect on the hero
                            angel.apply(abilitiesInstance, (Pyromancer) hero, (Knight) hero, (Wizard) hero, (Rogue) hero);
                        }
                    }
                }
            }
        }
        // Print results
        System.out.println("~~ Results ~~");
        for (Heroes hero : heroes) {
            // Print hero's class abbreviation
            System.out.print(hero.getClass().getSimpleName().charAt(0) + " ");
            if (hero.getHP() <= 0) {
                // If hero is dead
                System.out.println("dead");
            } else {
                // If hero is alive, print its stats
                System.out.println(hero.getCurrentLevel() + " " + hero.getHP() + " " + hero.getMaxHP() + " " + hero.getXP_Winner() + " " + hero.getXP_Loser());
            }
        }
    }
}