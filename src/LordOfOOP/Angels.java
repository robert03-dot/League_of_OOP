package LordOfOOP;

public class Angels extends Abilities {
    public int damageAngel;
    public int darkAngel;
    private int Dracula;
    private int goodBoy;
    private int LevelUpAngel;
    private int lifeGiver;
    private int smallAngel;
    private int spawner;
    private int theDoomer;
    private int xpAngel;

    public Angels(int round, String angelType, int x, int y) {
    }
    private int round;
    private String type;
    private int X;
    private int Y;
    // Getter method for the round attribute
    public int getRound() {
        return round;
    }
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }
    public String getType() {
        return type;
    }
    // Setter method for the round attribute, if needed
    public void setRound(int round) {
        this.round = round;
    }
    public void setX(int X){
        this.X = X;
    }
    public void setY(int Y){
        this.Y = Y;
    }
    // Setter method for the type attribute, if needed
    public void setType(String type) {
        this.type = type;
    }
    public void apply(Abilities abilities,Pyromancer pyromancer,Knight knight, Wizard wizard, Rogue rogue) {
        damageAngel = (int) (getDamage() + knight.getDamage() * 0.15);
        damageAngel = (int) (getDamage() + pyromancer.getDamage() * 0.2);
        damageAngel = (int) (getDamage() + wizard.getDamage() * 0.4);
        damageAngel = (int) (getDamage() + rogue.getDamage() * 0.3);

        Dracula = (int) (getDamage() - knight.getDamage() * 0.2);
        Dracula = (int) (getDamage() - pyromancer.getDamage() * 0.3);
        Dracula = (int) (getDamage() - wizard.getDamage() * 0.1);
        Dracula = (int) (getDamage() - rogue.getDamage() * 0.4);

        goodBoy = (int) (getDamage() + knight.getDamage() * 0.4);
        goodBoy = (int) (getDamage() + pyromancer.getDamage() * 0.5);
        goodBoy = (int) (getDamage() + wizard.getDamage() * 0.5);
        goodBoy = (int) (getDamage() + rogue.getDamage() * 0.3);

        LevelUpAngel = (int) (getDamage() + knight.getDamage() * 0.1);
        LevelUpAngel = (int) (getDamage() + pyromancer.getDamage() * 0.2);
        LevelUpAngel = (int) (getDamage() + wizard.getDamage() * 0.15);
        LevelUpAngel = (int) (getDamage() + rogue.getDamage() * 0.25);

        smallAngel = (int) (getDamage() + knight.getDamage() * 0.1);
        smallAngel = (int) (getDamage() + pyromancer.getDamage() * 0.15);
        smallAngel = (int) (getDamage() + wizard.getDamage() * 0.5);
        smallAngel = (int) (getDamage() + rogue.getDamage() * 0.1);

        theDoomer = knight.setDamage(knight.getHP());
        theDoomer = pyromancer.setDamage(knight.getHP());
        theDoomer = wizard.setDamage(knight.getHP());
        theDoomer = rogue.setDamage(knight.getHP());

        darkAngel = (int) (getHP() - knight.getHP() * 0.4);
        darkAngel = (int) (getHP() - pyromancer.getHP() * 0.3);
        darkAngel = (int) (getHP() - wizard.getHP() * 0.1);
        darkAngel = (int) (getHP() - rogue.getHP() * 0.2);

        Dracula = (int) (getHP() - knight.getHP() * 0.6);
        Dracula = (int) (getHP() - pyromancer.getHP() * 0.6);
        Dracula = (int) (getHP() - wizard.getHP() * 0.35);
        Dracula = (int) (getHP() - rogue.getHP() * 0.2);

        lifeGiver = (int) (getHP() + knight.getHP() * 1.0);
        lifeGiver = (int) (getHP() + pyromancer.getHP() * 0.8);
        lifeGiver = (int) (getHP() + wizard.getHP() * 0.9);
        lifeGiver = (int) (getHP() + rogue.getHP() * 0.12);

        smallAngel = (int) (getDamage() + knight.getHP() * 0.1);
        smallAngel = (int) (getDamage() + pyromancer.getHP() * 0.15);
        smallAngel = (int) (getDamage() + wizard.getHP() * 0.2);
        smallAngel = (int) (getDamage() + rogue.getHP() * 0.25);

        if (knight.getHP() == 0) {
            spawner = knight.setHP(200);
        }
        if (pyromancer.getHP() == 0) {
            spawner = pyromancer.setHP(200);
        }
        if (wizard.getHP() == 0) {
            spawner = wizard.setHP(200);
        }
        if (rogue.getHP() == 0) {
            spawner = rogue.setHP(200);
        }

        xpAngel = (int) (getExperiencePoints() + knight.getExperiencePoints() * getCurrentLevel());
        xpAngel = (int) (getExperiencePoints() + pyromancer.getExperiencePoints() * getCurrentLevel());
        xpAngel = (int) (getExperiencePoints() + rogue.getExperiencePoints() * getCurrentLevel());
        xpAngel = (int) (getExperiencePoints() + wizard.getExperiencePoints() * getCurrentLevel());
    }
}
