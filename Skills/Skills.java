package Skills;

public class Skills {

    protected int lvl;
    protected String skillName;
    protected int expToNextLvl;

    // Constructor
    public Skills(int lvl, String skillName) {
        this.lvl = lvl;
        this.skillName = skillName;
        this.expToNextLvl = 0;
    }

    public void checkSkillLevel() {
        System.out.println(this.skillName + ": " + this.lvl + "/10");
    }

    public void scanLearnSkill(String number) {
        System.out.println(number + ": " + this.skillName);
    }

    public void gainExp() {
        int plusExp = (int) (Math.random() * 3);
        this.expToNextLvl += plusExp;
        System.out.println("+ " + plusExp + "xp gained.");
    }

    private boolean isexpBetween(int min, int max) {
        return this.expToNextLvl >= min && this.expToNextLvl <= max;
    }

    public void learn() {
        if (this.lvl == 10) {
            this.lvl = 10;
            System.out.println("Skill is already on max level!");
        } else {
            this.lvl += 1;
            System.out.println("Level up! " + this.skillName + " is now " + this.lvl);
        }
    }

    private void setSkillLevel() {
        this.learn();
        this.expToNextLvl = 0;
    }

    private void isLevelUp() {
        if (isexpBetween(6, 9)) {
            this.setSkillLevel();
        } else if (isexpBetween(10, 13)) {
            this.setSkillLevel();
        } else if (isexpBetween(17, 21)) {
            this.setSkillLevel();
        } else if (isexpBetween(28, 31)) {
            this.setSkillLevel();
        } else if (isexpBetween(37, 41)) {
            this.setSkillLevel();
        } else if (isexpBetween(50, 55)) {
            this.setSkillLevel();
        } else if (isexpBetween(62, 68)) {
            this.setSkillLevel();
        } else if (isexpBetween(74, 78)) {
            this.setSkillLevel();
        } else if (isexpBetween(85, 91)) {
            this.setSkillLevel();
        } else if (isexpBetween(99, 106)) {
            this.setSkillLevel();
        }
    }

    public void levelUp() {
        this.gainExp();
        this.isLevelUp();
    }
}
