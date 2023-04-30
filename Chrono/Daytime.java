package Chrono;


public class Daytime {

    private static final Day[] WEEK = { Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY };

    Time time = new Time();
    int todayIndex = 0;

    private void nextDay() {
        if (todayIndex >= WEEK.length) {
            this.todayIndex = 0;
        } else {
            this.todayIndex += 1;
        }
    }

    public void addHour() {
        time.timeGoes();
        if (time.getTime() == 0) {
            this.nextDay();
        }
    }

    public Day getDay() {
        return WEEK[todayIndex];
    }

    public Time getTime() {
        return this.time;
    }

    public String toString() {
        return getDay().toString() + time.toString();
    }

}
