package LordOfOOP;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] roundInput = scanner.nextLine().split(" ");
        int rounds = Integer.parseInt(roundInput[1]);

        scanner.nextLine();

        int heroCount = Integer.parseInt(scanner.nextLine());

        ArrayList<Heroes> heroes = new ArrayList<>();
        for(int i=0;i<heroCount;i++){
            String[] heroData = scanner.nextLine().split(" ");
            char heroType = heroData[0].charAt(0);
            int x = Integer.parseInt(heroData[1]);
            int y = Integer.parseInt(heroData[2]);
            switch (heroType){
                case 'K':
                    heroes.add(new Knight(x,y));
                    break;
                case 'W':
                    heroes.add(new Wizard(x,y));
                    break;
                case 'P':
                    heroes.add(new Pyromancer(x,y));
                    break;
                case 'R':
                    heroes.add(new Rogue(x,y));
                    break;
            }
        }
        Abilities abilitiesInstance = new Abilities(); // Assuming Abilities class has a no-argument constructor
        Knight knightInstance = new Knight(0, 0); // Assuming initial coordinates are (0, 0)
        Pyromancer pyromancerInstance = new Pyromancer(0, 0); // Assuming initial coordinates are (0, 0)
        Rogue rogueInstance = new Rogue(0, 0); // Assuming initial coordinates are (0, 0)
        Wizard wizardInstance = new Wizard(0, 0); // Assuming initial coordinates are (0, 0)

        int angelCount = Integer.parseInt(scanner.nextLine());

        ArrayList<Angels> angels = new ArrayList<>();
        for(int i=0;i<angelCount;i++){
            String[] angelData = scanner.nextLine().split(" ");
            int round = Integer.parseInt(angelData[0]);
            String[] angelInfo = angelData[1].split(",");
            String angelType = angelInfo[0];
            int X = Integer.parseInt(angelInfo[1]);
            int Y = Integer.parseInt(angelInfo[2]);
            angels.add(new Angels());
        }
        for(int currentRound = 1;currentRound<=rounds;currentRound++){
            System.out.println("~~ Round " + currentRound + " ~~");
            for(Angels angel : angels){
                if(angel.getRound() == currentRound){
                    System.out.println("Angel " + angel.getType() + " was spawned at " + angel.getX() + " " + angel.getY());
                    for(Heroes hero:heroes){
                        if(hero.getX() == angel.getX() && hero.getY() == angel.getY()){
                            angel.apply(abilitiesInstance, (Pyromancer) hero, (Knight) hero, (Wizard) hero, (Rogue) hero);
                        }
                    }
                }
            }
        }
        System.out.println("~~ Results ~~");
        for(Heroes hero:heroes){
            System.out.println(hero.getClass().getSimpleName().charAt(0)+" ");
            if(hero.getHP()<=0){
                System.out.println("dead");
            }else{
                System.out.println(hero.getCurrentLevel() + " " + hero.getHP() + " " + hero.getMaxHP() + " " + hero.getXP_Winner() + " " + hero.getXP_Loser());
            }
        }
    }
}