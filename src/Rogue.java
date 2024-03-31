public class Rogue extends Abilities{
    public void update(int HP){
        super.update(600);
        if(super.levelUp()>super.getCurrentLevel()){
            setHP(getHP()+40);
        }
        super.damage(200);
        if(super.levelUp()>super.getCurrentLevel()){
            setBackstab(getDamage()+20);
        }
        super.damage(40);
        if(super.levelUp()>super.getCurrentLevel()){
            setParalysis(getDamage()+10);
        }
    }
    public void rogueHome(Rogue rogue,Map map){
        int attacksCounter = 0;
        if(map == Map.Woods){
            rogue.setDrain(rogue.getDamage()+10);
            rogue.setDeflect(rogue.getDamage()+10);
            attacksCounter++;
            do{
                rogue.setDrain(rogue.getDamage()*1.5);
                rogue.setDeflect(rogue.getDamage()*1.5);
                attacksCounter++;
            }while(attacksCounter<3);
        }
    }
}