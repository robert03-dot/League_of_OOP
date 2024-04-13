package LordOfOOP;

public class LordOfOOP extends Abilities {
    private static LordOfOOP instance;
    private int round;
    private String angelType;

    LordOfOOP(){

    }
    //singleton este un design pattern ce presupune doua conditii:
    //1)clasa are constructor fara parametri,privat
    //2)clasa are o metoda denumita getInstance ce intoarce un obiect de tipul clasei
    //3)metoda este static si synchronized(synchronized stie ca va exista un singur obiect de tipul acestei clase in toata aplicatia)
    public static synchronized LordOfOOP getInstance(){
        if(instance == null){
            instance = new LordOfOOP();
        }
        return instance;
    }
    private static LordOfOOP instanceForAngels;
    public static LordOfOOP getInstanceForAngels(){
        if(instanceForAngels == null){
            instanceForAngels = new LordOfOOP();
        }
        return instanceForAngels;
    }
    public Angels createAngels(){
        Angels angels = new Angels(round, angelType, X, Y);
        return angels;
    }
    public void KnightAttackCombat(Pyromancer pyromancer, Knight knight, Wizard wizard, Rogue rogue, Map map, Abilities abilities) {
        if (map == Map.Land && abilities.getExecute() == 1) {
            int baseDamage = 200 + 30 * knight.getCurrentLevel();

            int hpLimit = (int) (0.2 * knight.getHP());

            hpLimit = (int) Math.min(hpLimit, 0.4 * knight.getHP());

            int PyromancerDamage = pyromancer.getDamage();

            int KnightDamage = knight.getDamage();

            int WizardDamage = wizard.getDamage();

            int RogueDamage = rogue.getDamage();

            double actualDamageKnight = KnightDamage * 0.0;
            knight.damage((int) actualDamageKnight);// Calculate actual damage after reduction

            double actualDamagePyromancer = PyromancerDamage * 0.1;
            pyromancer.damage((int) actualDamagePyromancer);

            double actualDamageRogue = RogueDamage * 1.15;
            rogue.damage((int) actualDamageRogue);

            double actualDamageWizard = WizardDamage * 0.80;
            pyromancer.damage((int) actualDamageWizard);

            double actualDamageKnightToRogue = KnightDamage * 0.15;
            rogue.damage((int) actualDamageKnightToRogue);

            double actualDamageKnightToWizard = KnightDamage * (-0.20);
            wizard.damage((int) actualDamageKnightToWizard);
        } else if (map == Map.Land && abilities.getSlam() == 1) {

            int baseDamage = 100 * getDamage() + 40 * knight.getCurrentLevel();

            int PyromancerDamage = pyromancer.getDamage();

            int KnightDamage = knight.getDamage();

            int WizardDamage = wizard.getDamage();

            int RogueDamage = rogue.getDamage();

            double actualDamageKnight = KnightDamage * 0.20;
            knight.damage((int) actualDamageKnight);// Calculate actual damage after reduction

            double actualDamagePyromancer = PyromancerDamage * 0.10;
            pyromancer.damage((int) actualDamagePyromancer);

            double actualDamageRogue = RogueDamage * (-0.20);
            rogue.damage((int) actualDamageRogue);

            double actualDamageWizard = WizardDamage * 0.05;
            pyromancer.damage((int) actualDamageWizard);

            double actualDamageKnightToRogue = KnightDamage * (-0.20);
            rogue.damage((int) actualDamageKnightToRogue);

            double actualDamageKnightToWizard = KnightDamage * 0.05;
            wizard.damage((int) actualDamageKnightToWizard);
        }
    }

    public void PyromancerAttackCombat(Pyromancer pyromancer, Knight knight, Wizard wizard, Rogue rogue, Map map, Abilities abilities) {
        for (int round = 1; round <= 4; round++) {
            if (map == Map.Land && abilities.getFireblast() == 1) {
                int PyromancerDamage = pyromancer.getDamage();

                int KnightDamage = knight.getDamage();

                int WizardDamage = wizard.getDamage();

                int RogueDamage = rogue.getDamage();

                double actualDamageKnight = KnightDamage * 1.20;
                knight.damage((int) actualDamageKnight);// Calculate actual damage after reduction

                double actualDamagePyromancer = PyromancerDamage * 0.90;
                pyromancer.damage((int) actualDamagePyromancer);

                double actualDamageRogue = RogueDamage * 20.0;
                rogue.damage((int) actualDamageRogue);

                double actualDamageWizard = WizardDamage * 5.0;
                pyromancer.damage((int) actualDamageWizard);
            } else if (map == Map.Land && abilities.getIgnite() == 1) {
                int PyromancerDamage = pyromancer.getDamage();

                int KnightDamage = knight.getDamage();

                int WizardDamage = wizard.getDamage();

                int RogueDamage = rogue.getDamage();

                double actualDamageKnight = KnightDamage * 20.0;
                knight.damage((int) actualDamageKnight);// Calculate actual damage after reduction

                double actualDamagePyromancer = PyromancerDamage * 10.0;
                pyromancer.damage((int) actualDamagePyromancer);

                double actualDamageRogue = RogueDamage * 20.0;
                rogue.damage((int) actualDamageRogue);

                double actualDamageWizard = WizardDamage * 5.0;
                pyromancer.damage((int) actualDamageWizard);
            }
        }
    }

    public void RogueAttackCombat(Pyromancer pyromancer, Knight knight, Wizard wizard, Rogue rogue, Map map, Abilities abilities) {
        for (int round = 1; round <= 4; round++) {
            if (map == Map.Land && abilities.getBackstab() == 1) {
                int PyromancerDamage = pyromancer.getDamage();

                int KnightDamage = knight.getDamage();

                int WizardDamage = wizard.getDamage();

                int RogueDamage = rogue.getDamage();

                double actualDamageKnight = KnightDamage * 10.0;
                knight.damage((int) actualDamageKnight);// Calculate actual damage after reduction

                double actualDamagePyromancer = PyromancerDamage * 25;
                pyromancer.damage((int) actualDamagePyromancer);

                double actualDamageRogue = RogueDamage * 20;
                rogue.damage((int) actualDamageRogue);

                double actualDamageWizard = WizardDamage * 25;
                pyromancer.damage((int) actualDamageWizard);
            } else if (map == Map.Land && abilities.getParalysis() == 1) {
                int PyromancerDamage = pyromancer.getDamage();

                int KnightDamage = knight.getDamage();

                int WizardDamage = wizard.getDamage();

                int RogueDamage = rogue.getDamage();

                double actualDamageKnight = KnightDamage * 20.0;
                knight.damage((int) actualDamageKnight);// Calculate actual damage after reduction

                double actualDamagePyromancer = PyromancerDamage * 10.0;
                pyromancer.damage((int) actualDamagePyromancer);

                double actualDamageRogue = RogueDamage * 20.0;
                rogue.damage((int) actualDamageRogue);

                double actualDamageWizard = WizardDamage * 5.0;
                pyromancer.damage((int) actualDamageWizard);
            }
        }
    }

    public void WizardAttackCombat(Pyromancer pyromancer, Knight knight, Wizard wizard, Rogue rogue, Map map, Abilities abilities) {
        for (int round = 1; round <= 4; round++) {
            if (map == Map.Land && abilities.getDrain() == 1) {

                int percent = 20 + 5 * knight.getCurrentLevel();

                int totalPercent = percent / 100;

                int opponentHP;

                int opponentCurrentHP;

                if (rogue.getCurrentLevel() > 0.3 * rogue.getHP()) {
                    opponentHP = rogue.getHP();
                    opponentCurrentHP = rogue.getHP();
                } else {
                    opponentHP = (int) (0.3 * rogue.getHP());
                    opponentCurrentHP = rogue.getHP();
                }
                int hp = (int) (totalPercent * Math.min(0.3 * opponentHP, opponentCurrentHP));
                int damage = (int) (totalPercent * Math.min(0.3 * opponentHP, opponentCurrentHP));

                int PyromancerDamage = pyromancer.getDamage();

                int KnightDamage = knight.getDamage();

                int WizardDamage = wizard.getDamage();

                int RogueDamage = rogue.getDamage();

                double actualDamageKnight = KnightDamage * 20;
                knight.damage((int) actualDamageKnight);// Calculate actual damage after reduction

                double actualDamagePyromancer = PyromancerDamage * 10;
                pyromancer.damage((int) actualDamagePyromancer);

                double actualDamageRogue = RogueDamage * 20;
                rogue.damage((int) actualDamageRogue);

                double actualDamageWizard = WizardDamage * 5;
                pyromancer.damage((int) actualDamageWizard);
            } else if (map == Map.Land && abilities.getDeflect() == 1) {

                int percent = 35 + 2 * getCurrentLevel();

                int maxPercent = 70;

                if (percent > maxPercent) {
                    break;
                }

                int PyromancerDamage = pyromancer.getDamage();

                int KnightDamage = knight.getDamage();

                int WizardDamage = wizard.getDamage();

                int RogueDamage = rogue.getDamage();

                double actualDamageKnight = KnightDamage * 20.0;
                knight.damage((int) actualDamageKnight);// Calculate actual damage after reduction

                double actualDamagePyromancer = PyromancerDamage * 10.0;
                pyromancer.damage((int) actualDamagePyromancer);

                double actualDamageRogue = RogueDamage * 20.0;
                rogue.damage((int) actualDamageRogue);

                double actualDamageWizard = WizardDamage * 5.0;
                pyromancer.damage((int) actualDamageWizard);
            }
        }
    }

    public void Comparison(Pyromancer pyromancer, Knight knight, Wizard wizard, Rogue rogue, Map map, Abilities abilities) {
        int maxRounds = 1;
        int currentRound = 1;
        while (currentRound <= maxRounds) {
            for (int round = 1; round <= 4; round++) {
                if (map == Map.Land) {
                    if (abilities.getExecute() == 1)
                        KnightAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getSlam() == 1) {
                    KnightAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getFireblast() == 1) {
                    PyromancerAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getIgnite() == 1) {
                    PyromancerAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getDrain() == 1) {
                    WizardAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getDeflect() == 1) {
                    WizardAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getParalysis() == 1) {
                    RogueAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getBackstab() == 1) {
                    RogueAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (map == Map.Volcanic) {
                    if (abilities.getExecute() == 1)
                        KnightAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getSlam() == 1) {
                    KnightAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getFireblast() == 1) {
                    PyromancerAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getIgnite() == 1) {
                    PyromancerAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getDrain() == 1) {
                    WizardAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getDeflect() == 1) {
                    WizardAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getParalysis() == 1) {
                    RogueAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getBackstab() == 1) {
                    RogueAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (map == Map.Desert) {
                    if (abilities.getExecute() == 1)
                        KnightAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getSlam() == 1) {
                    KnightAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getFireblast() == 1) {
                    PyromancerAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getIgnite() == 1) {
                    PyromancerAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getDrain() == 1) {
                    WizardAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getDeflect() == 1) {
                    WizardAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getParalysis() == 1) {
                    RogueAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getBackstab() == 1) {
                    RogueAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (map == Map.Woods) {
                    if (abilities.getExecute() == 1)
                        KnightAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getSlam() == 1) {
                    KnightAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getFireblast() == 1) {
                    PyromancerAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getIgnite() == 1) {
                    PyromancerAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getDrain() == 1) {
                    WizardAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getDeflect() == 1) {
                    WizardAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getParalysis() == 1) {
                    RogueAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                } else if (abilities.getBackstab() == 1) {
                    RogueAttackCombat(pyromancer, knight, wizard, rogue, map, abilities);

                }
                if (knight.getHP() <= 0) {
                    System.out.println("The knight is defeated");
                    break;
                }
                if (wizard.getHP() <= 0) {
                    System.out.println("The wizard is defeated");
                    break;
                }
                if (rogue.getHP() <= 0) {
                    System.out.println("The rogue is defeated");
                    break;
                }
                if (pyromancer.getHP() <= 0) {
                    System.out.println("The pyromancer is defeated");
                    break;
                }
                currentRound++;
            }
            if (knight.getHP() > 0 && pyromancer.getHP() <= 0 && wizard.getHP() <= 0 && rogue.getHP() <= 0) {
                System.out.println("The knight wins!");

            } else if (pyromancer.getHP() > 0 && knight.getHP() <= 0 && wizard.getHP() <= 0 && rogue.getHP() <= 0) {
                System.out.println("The pyromancer wins!");

            } else if (rogue.getHP() > 0 && knight.getHP() <= 0 && wizard.getHP() <= 0 && rogue.getHP() <= 0) {
                System.out.println("The rogue wins!");

            } else if (wizard.getHP() > 0 && knight.getHP() <= 0 && wizard.getHP() <= 0 && rogue.getHP() <= 0) {
                System.out.println("The wizard wins!");

            } else {
                System.out.println("Draw!");
            }
        }
    }
    public static void knightStrategy(Knight knight) {
        int maxHP = knight.getMaxHP();
        int currentLevel = knight.getCurrentLevel();
        int maxLevelHP = maxHP * currentLevel;

        if (currentLevel > maxLevelHP / 3 && currentLevel < maxLevelHP / 2) {
            // If CURRENT_HP is between 1/3 and 1/2 of MAX_LEVEL_HP
            // Reduce current HP by 1/5
            int reduction = (int) (knight.getHP() * 0.2); // 20% reduction
            knight.setHP(knight.getHP() - reduction);
        } else if (currentLevel < maxLevelHP / 3) {
            // If CURRENT_HP is less than 1/3 of MAX_LEVEL_HP
            // Reduce coefficients by 20%
            int reducedDamage = (int) (knight.getDamage() * 0.8);
            knight.setDamage(reducedDamage);

            // Increase current HP by 1/4 of current HP
            int hpIncrease = knight.getHP() / 4;
            knight.setHP(knight.getHP() + hpIncrease);
        }
    }
    public static void pyromancerStrategy(Pyromancer pyromancer) {
        int maxHP = pyromancer.getMaxHP();
        int currentLevel = pyromancer.getCurrentLevel();
        int maxLevelHP = maxHP * currentLevel;

        if (currentLevel > maxLevelHP / 4 && currentLevel < maxLevelHP / 3) {
            // If CURRENT_HP is between 1/3 and 1/2 of MAX_LEVEL_HP
            // Reduce current HP by 1/5
            int reduction = (int) (pyromancer.getHP() * 0.6); // 20% reduction
            pyromancer.setHP(pyromancer.getHP() - reduction);
        } else if (currentLevel < maxLevelHP / 4) {
            // If CURRENT_HP is less than 1/3 of MAX_LEVEL_HP
            // Reduce coefficients by 20%
            int reducedDamage = (int) (pyromancer.getDamage() * 0.2);
            pyromancer.setDamage(reducedDamage);

            // Increase current HP by 1/4 of current HP
            int hpIncrease = pyromancer.getHP() / 5;
            pyromancer.setHP(pyromancer.getHP() + hpIncrease);
        }
    }
    public static void rogueStrategy(Rogue rogue) {
        int maxHP = rogue.getMaxHP();
        int currentLevel = rogue.getCurrentLevel();
        int maxLevelHP = maxHP * currentLevel;

        if (currentLevel > maxLevelHP / 4 && currentLevel < maxHP / 2) {
            // If CURRENT_HP is between 1/3 and 1/2 of MAX_LEVEL_HP
            // Reduce current HP by 1/5
            int reduction = (int) (rogue.getHP() * 0.4); // 20% reduction
            rogue.setHP(rogue.getHP() - reduction);
        } else if (currentLevel < maxLevelHP / 7) {
            // If CURRENT_HP is less than 1/3 of MAX_LEVEL_HP
            // Reduce coefficients by 20%
            int reducedDamage = (int) (rogue.getDamage() * 0.1);
            rogue.setDamage(reducedDamage);

            // Increase current HP by 1/4 of current HP
            int hpIncrease = rogue.getHP() / 4;
            rogue.setHP(rogue.getHP() + hpIncrease);
        }
    }
    public static void wizardStrategy(Wizard wizard) {
        int maxHP = wizard.getMaxHP();
        int currentLevel = wizard.getCurrentLevel();
        int maxLevelHP = maxHP * currentLevel;

        if (currentLevel > maxLevelHP / 4 && currentLevel < maxHP / 2) {
            // If CURRENT_HP is between 1/3 and 1/2 of MAX_LEVEL_HP
            // Reduce current HP by 1/5
            int reduction = (int) (wizard.getHP() * 0.6); // 20% reduction
            wizard.setHP(wizard.getHP() - reduction);
        } else if (currentLevel < maxLevelHP / 4) {
            // If CURRENT_HP is less than 1/3 of MAX_LEVEL_HP
            // Reduce coefficients by 20%
            int reducedDamage = (int) (wizard.getDamage() * 0.2);
            wizard.setDamage(reducedDamage);

            // Increase current HP by 1/4 of current HP
            int hpIncrease = wizard.getHP() / 5;
            wizard.setHP(wizard.getHP() + hpIncrease);
        }
    }
}