package LordOfOOP;

public class Abilities extends Heroes{
    private int HP;
    private int damage;
    private int fireblast;
    private int ignite;
    //pyromancer
    private int execute;
    private int slam;
    //knight
    private int drain;
    private int deflect;
    //wizard
    private int backstab;
    private int paralysis;
    //rogue

    public Abilities() {
        super();
        this.HP = 100; // Default starting HP
        this.maxHP = calculateMaxHP();
    }
    public Knight createKnight(int x, int y) {
        return new Knight(x, y);
    }
    public Pyromancer createPyromancer(int x,int y){
        return new Pyromancer(x,y);
    }
    public Rogue createRogue(int x, int y) {
        return new Rogue(x, y);
    }

    public Wizard createWizard(int x, int y) {
        return new Wizard(x, y);
    }
    private int calculateMaxHP() {
        // Example formula: maxHP = baseHP + (level * multiplier)
        int baseHP = 100; // Example base HP
        double multiplier = 10; // Example multiplier
        return baseHP + (getCurrentLevel() * (int) multiplier);
    }


    public void update(int HP){
        this.HP += HP;
    }
    public void damage(int damageAmount) {
        this.HP -= damageAmount;
    }
    public int getHP() {
        return HP;
    }

    public int setHP(int HP) {
        this.HP = HP;
        return HP;
    }

    public int getDamage() {
        return damage;
    }

    public int setDamage(int damage) {
        this.damage = damage;
        return damage;
    }

    public int getFireblast() {
        return fireblast;
    }

    public void setFireblast(int fireblast) {
        this.fireblast = fireblast;
    }

    public int getIgnite() {
        return ignite;
    }

    public void setIgnite(int ignite) {
        this.ignite = ignite;
    }

    public int getExecute() {
        return execute;
    }

    public void setExecute(int execute) {
        this.execute = execute;
    }

    public int getSlam() {
        return slam;
    }

    public void setSlam(int slam) {
        this.slam = slam;
    }

    public int getDrain() {
        return drain;
    }

    public void setDrain(double drain) {
        this.drain = (int) drain;
    }

    public int getDeflect() {
        return deflect;
    }

    public void setDeflect(double deflect) {
        this.deflect = (int) deflect;
    }

    public int getBackstab() {
        return backstab;
    }

    public void setBackstab(int backstab) {
        this.backstab = backstab;
    }

    public int getParalysis() {
        return paralysis;
    }

    public void setParalysis(int paralysis) {
        this.paralysis = paralysis;
    }
}