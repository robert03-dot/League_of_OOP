public class Pyromancer extends Abilities{
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