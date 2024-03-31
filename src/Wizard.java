public class Wizard extends Abilities{
    public void update(int HP){
        super.update(400);
        if(super.levelUp()>super.getCurrentLevel()){
            setHP(getHP()+30);
        }
        super.damage(20);
        if(super.levelUp()>super.getCurrentLevel()){
            setDrain(getDamage()+5);
        }
        super.damage(35);
        if(super.levelUp()>super.getCurrentLevel()){
            setDeflect(getDamage()+2);
        }
    }
    public void wizardHome(Wizard wizard,Map map){
        if(map == Map.Desert){
            wizard.setDrain(wizard.getDamage()+10);
            wizard.setDeflect(wizard.getDamage()+10);
        }
    }
}