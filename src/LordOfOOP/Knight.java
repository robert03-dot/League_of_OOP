package LordOfOOP;

public class Knight extends Abilities{
    public Knight(int x, int y) {
    }

    public void update(int HP){
        super.update(900);
        if(super.levelUp()>super.getCurrentLevel()){
            setHP(getHP()+80);
        }
        super.damage(200);
        if(super.levelUp()>super.getCurrentLevel()){
            setExecute(getDamage()+30);
        }
        super.damage(100);
        if(super.levelUp()>super.getCurrentLevel()){
            setSlam(getDamage()+40);
        }

    }

}
