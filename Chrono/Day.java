package Chrono;

public class Day {
    String day;
    Time todayTime = new Time();
    
    public Day(String day) {
        this.day = day;
        todayTime.time = 0;
    }

    public static void createDays() {
        Day monday = new Day("monday");
        Day tuesday = new Day("tuesday");
        Day wednesday = new Day("wednesday");
        Day thursday = new Day("thursday");
        Day friday = new Day("friday");
        Day saturday = new Day("saturday");
        Day sunday = new Day("sunday");

        Object[] weekArray = {monday, tuesday, wednesday, thursday, friday, saturday, sunday};
    }

    public static void loopThroughDays() {
    }

    public void goToNextDay() {
        if (todayTime.time >= 24) {
        }
    }




}
