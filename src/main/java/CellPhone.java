import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;

public class CellPhone {

    CallingCard card;
    boolean isTalking;
    ArrayList<Call> history;
    Call currentCall;

    public CellPhone(CallingCard card) {
        this.card = card;
        this.history = new ArrayList<Call>();
    }

    public boolean isTalking() {
        return isTalking;
    }

    public void call(String number) {
        currentCall = new Call(number);
        isTalking = true;
        history.add(currentCall);
    }

    public void tick() {
        if (isTalking) {
            card.useMinutes(1);
            currentCall.increaseDuration(1);
        }
    }

    public void endCall() {
        isTalking = false;
        currentCall.endCall();
    }

    public String getHistory() {
        ArrayList<String> call_strings = new ArrayList<String>();
        for (Call call : history) {
            call_strings.add(call.toString());
        }
        return StringUtils.join(call_strings, ", ");
    }
}
