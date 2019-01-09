public class Call {

    String number;
    int duration;
    boolean isTalking;

    public Call(String number) {
        this.number = number;
        this.isTalking = true;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void endCall() {
        this.isTalking = false;
    }

    public void increaseDuration(int minutes) {
        duration += minutes;
    }

    public String toString() {
        String minuteWord;
        if (duration == 1) {
            minuteWord = "minute";
        } else {
            minuteWord = "minutes";
        }
        if (isTalking == true) {
            return number + " (cut off at " + duration + " " + minuteWord + ")";
        } else {
            return number + " (" + duration + " " + minuteWord + ")";
        }
    }
}
