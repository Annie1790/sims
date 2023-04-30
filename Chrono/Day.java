package Chrono;

public class Day {
    public String day;

    public Day(String day) {
        this.day = day;
    }

    // consts are Uppercase, naming convention
    public static final Day MONDAY = new Day("Monday");
    public static final Day TUESDAY = new Day("Tuesday");
    public static final Day WEDNESDAY = new Day("Wednesday");
    public static final Day THURSDAY = new Day("Thursday");
    public static final Day FRIDAY = new Day("Friday");
    public static final Day SATURDAY = new Day("Saturday");
    public static final Day SUNDAY = new Day("Sunday");

    @Override
    public String toString() {
        return "\nThe day is " + this.day + ".";
    }

}
