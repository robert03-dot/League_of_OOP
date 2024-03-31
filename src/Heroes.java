public class Heroes {
    private int XP_Winner;
    private int XP_Loser;
    private final int experiencePoints;
    private final int initialXp;
    public int currentLevel;
    public int HP;

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Heroes() {
        this.XP_Winner = 0;
        this.XP_Loser = 0;
        this.experiencePoints = 0;
        this.initialXp = 0;
        this.currentLevel = 0;
        this.HP = 0;
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
