package Needs;
public class Needs {

    protected int full;
    protected String name;

    // Constructor
    public Needs(int full, String name) {
        this.full = full;
        this.name = name;
    }

    public void checkNeeds() {
        System.out.println(this.name + ": " + this.full + "/10");
    }

    public void fillNeeds() {
        if (this.full == 10) {
            this.full = 10;
            System.out.println("Your bar is already full");

        } else {
            this.full += 1;
            System.out.println(this.name + "is now " + this.full + "/10");
        }
    }
}
