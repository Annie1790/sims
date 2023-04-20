public class Needs {

    protected int full;
    protected String name;

    // Constructor
    public Needs(int full, String name) {
        this.full = full;
        this.name = name;
    }

    public void checkNeeds(Needs needs) {
        System.out.println(this.name + ": " + this.full + "/10");
    }

    public void fillNeeds(int need) {
        if (need == 10) {
            need = 10;

        } else {
            need += 1;
        }
    }
}
