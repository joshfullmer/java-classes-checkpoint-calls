public class CallingCard {

    private int centsPerMinute;
    private int minutesRemaining;

    public CallingCard(int centsPerMinute) {
        this.centsPerMinute = centsPerMinute;
    }

    public void addDollars(int dollars) {
        minutesRemaining += (dollars * 100) / centsPerMinute;
    }

    public void useMinutes(int minutes) {
        if (minutes > minutesRemaining) {
            minutesRemaining = 0;
        } else {
            minutesRemaining -= minutes;
        }
    }

    public int getMinutesRemaining() {
        return minutesRemaining;
    }
}
