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
    }

    public void Abilities(int HP, int damage){
        this.HP = HP;
        this.damage = damage;
    }
    public void update(int HP){
        this.HP += HP;
    }
    public void damage(int damageAmount) {
        this.HP -= damageAmount;
        // Additional logic if needed
    }
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
        this.drain = drain;
    }

    public int getDeflect() {
        return deflect;
    }

    public void setDeflect(double deflect) {
        this.deflect = deflect;
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