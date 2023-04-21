package Skills;
public class Skills {

    protected int lvl;
    protected String skillName;
    protected int expToNextLvl;
    //Constructor
    public Skills(int lvl, String skillName) {
        this.lvl = lvl;
        this.skillName = skillName;
        this.expToNextLvl = 0;
    }

    public void checkSkillLevel() {
        System.out.println(this.skillName + ": " + this.lvl + "/10");
    }

    public void learnSkill(int skill) {
        if (skill == 10) {
            skill = 10;
            System.out.println("Skill is already on max level!");
        } else {
            skill += 1;
            System.out.println("Level up!");
        }
    }
}
