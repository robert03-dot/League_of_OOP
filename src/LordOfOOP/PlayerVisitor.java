package LordOfOOP;

public interface PlayerVisitor {
    void visit(Knight knight);
    void visit(Pyromancer pyromancer);
    void visit(Wizard wizard);
    void visit(Rogue rogue);
}