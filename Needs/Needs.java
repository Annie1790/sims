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

    public void fillNeeds(int num) {
        if (this.full <= 10) {
            this.full = 10;
            System.out.println(this.name + " is now " + this.full + "/10");
        } else {
            this.full += num;
            if (this.full <= 10) {
                this.full = 10;
                System.out.println(this.name + " is now " + this.full + "/10");

            }
        }
    }

    static public void loseNeedsPoints(Needs[] array) {
        // loop for how many times the deduction will happen
        for (int i = 1; i <= (int) (Math.random() * 6); i++) {
            // random index on which object will the subtraction happen
            int randomIndex = (int) (Math.random() * 6);
            // random numbere for how much we will subtract
            int randomNumber = (int) (Math.random() * 2);
            //
            array[randomIndex].full -= randomNumber;
        }
    }
}
