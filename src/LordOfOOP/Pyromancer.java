package LordOfOOP;

import java.util.Random;

public class Pyromancer extends Abilities{
    public Pyromancer(int x, int y) {
    }

    public void pyromancerHome(Pyromancer pyromancer, int mapWidth, int mapHeight) {
        // Create a random number generator
        Random random = new Random();

        // Generate random x and y coordinates within the map boundaries
        int x = random.nextInt(mapWidth);
        int y = random.nextInt(mapHeight);

        // Set the Pyromancer's coordinates
        pyromancer.setX(x);
        pyromancer.setY(y);
    }
    public Pyromancer createPyromancer(int x, int y) {
        return new Pyromancer(x,y);
    }
    public void update(int HP) {
        super.update(500);
        if (super.levelUp() > super.getCurrentLevel()) {
            setHP(getHP() + 50);
        }
        super.damage(350);
        if (super.levelUp() > super.getCurrentLevel()) {
            setFireblast(getDamage() + 50);
        }
        super.damage(150);
        if (super.levelUp() > super.getCurrentLevel()) {
            setIgnite(getDamage() + 20);
        }
    }
    public void pyromancerHome(Pyromancer pyromancer,Map map){
        if(map == Map.Volcanic){
            pyromancer.setFireblast(pyromancer.getDamage()+25);
            pyromancer.setIgnite(pyromancer.getDamage()+25);
        }
    }
}