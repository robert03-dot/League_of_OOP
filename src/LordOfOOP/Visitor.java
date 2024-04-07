package LordOfOOP;

public class Visitor implements PlayerVisitor {
    public void visit(Knight knight){
        LordOfOOP.getInstance().knightStrategy(knight);
    }
    public void visit(Pyromancer pyromancer){
        LordOfOOP.getInstance().pyromancerStrategy(pyromancer);
    }
    public void visit(Wizard wizard){
        LordOfOOP.getInstance().wizardStrategy(wizard);
    }
    public void visit(Rogue rogue){
        LordOfOOP.getInstance().rogueStrategy(rogue);
    }
}