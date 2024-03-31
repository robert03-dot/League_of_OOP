public class Knight extends Abilities{
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
    public void knightHome(Knight knight,Map map){
        if(map == Map.Land){
            knight.setExecute(knight.getDamage()+15);
            knight.setSlam(knight.getDamage()+15);
        }
    }
}
