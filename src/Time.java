public class Time {
    private int hours, minutes, seconds;

    /**
     * Initalize a new Time Object with a specificed Military time.
     * @param hours The starting hours.
     * @param minutes The starting minutes.
     * @param seconds The starting seconds.
     */
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours; this.minutes = minutes; this.seconds = seconds;
    }

    /**
     * Updates the time by 1 second, each second it checks if 60 seconds have passed to create a minute, and if
     * 60 minutes have passed to create an hour.
     */
    public void tick() {
        seconds++;

        if (seconds >= 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes >= 60) {
            minutes = 0;
            hours++;
        }

        if (hours >= 24) hours = 0;

    }

    @Override
    public String toString() {
        String toReturn = "";

        if (hours >= 10) toReturn += "" + hours;
        else toReturn += "0" + hours;

        toReturn += ":";

        if (minutes >= 10) toReturn += "" + minutes;
        else toReturn += "0" + hours;

        toReturn += ":";

        if (seconds >= 10) toReturn += "" + seconds;
        else toReturn += "0" + seconds;

        return toReturn;
    }
}
