package LordOfOOP;

public class Heroes{
    public int XP_Winner;
    public int XP_Loser;
    public int experiencePoints;
    public int currentLevel;
    public int HP;
    public int maxHP;
    public int X;
    public int Y;

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getX() {
        return X;
    }

    public Heroes(int x, int y) {
        X = x;
        Y = y;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Heroes() {
        this.XP_Winner = 0;
        this.XP_Loser = 0;
        this.experiencePoints = 0;
        int initialXp = 0;
        this.currentLevel = 0;
        this.HP = 0;
    }
    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public int getXP_Winner() {
        return XP_Winner;
    }

    public void setXP_Winner(int XP_Winner) {
        this.XP_Winner = XP_Winner;
    }

    public int getXP_Loser() {
        return XP_Loser;
    }

    public void setXP_Loser(int XP_Loser) {
        this.XP_Loser = XP_Loser;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHP() {
        return HP;
    }

    public int setHP(int HP) {
        this.HP = HP;
        return HP;
    }

    public void XP(Heroes opponent) {
        int winnerXP = this.experiencePoints + Math.max(0, 200 - (XP_Winner - XP_Loser) * 40);
        int loserXP = opponent.experiencePoints + Math.max(0, 200 - (XP_Winner - XP_Loser) * 40);
        this.XP_Winner = winnerXP;
        opponent.XP_Loser = loserXP;
    }
    public int levelUp() {
        int experiencePoints = 250 + currentLevel * 50;
        if (experiencePoints > 250) {
            currentLevel++;
            HP = 100;
        }
        if (experiencePoints == 360) {
            currentLevel = 3;
        }
        return currentLevel;
    }
}
