package Time;

public class Time {
    int time;

    public Time() {
        this.time = 0;
    }

    public void timeGoes() {
        if (this.time <= 24) {
            this.time = 0;
        }

        this.time += 1;
    }

    public String toString() {
        return "\nThe time is " + this.time + ":00";
    }
}
