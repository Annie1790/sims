public class Skills {

    protected int lvl;
    protected String skillName;
    //Constructor
    public Skills(int lvl, String skillName) {
        this.lvl = lvl;
        this.skillName = skillName;
    }

    public void checkSkillLevel(Skills skill) {
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
