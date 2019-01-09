public class App {

    public static void main(String[] args) {
        CallingCard card = new CallingCard(20); // this card costs 20 cents / minute to use

        card.addDollars(1);           // add $1 (100 cents).  100 cents / 20 cents/minute = 5 minutes added

        System.out.println(card.getMinutesRemaining());   // returns 5  (5 minutes left)

        card.useMinutes(3);
        System.out.println(card.getMinutesRemaining());   // return 2

        card.useMinutes(1);
        System.out.println(card.getMinutesRemaining());   // returns 1

        CallingCard card1 = new CallingCard(11);
        card1.addDollars(3);         // 300 cents / 11 = 27.2727272... = 27 minutes added
        System.out.println(card1.getMinutesRemaining()); // => returns 27

        CallingCard card2 = new CallingCard(17);
        card2.addDollars(3);         // 300 cents / 17 = 17.647... = 17 minutes added
        System.out.println(card2.getMinutesRemaining()); // => returns 17


        CallingCard card3 = new CallingCard(10);
        card3.addDollars(1); // add 100 cents @ 10 cents/minute = 10 minutes added

        CellPhone phone = new CellPhone(card3);
        System.out.println(phone.isTalking());  // => returns false

        phone.call("555-1212");
        System.out.println(phone.isTalking());  // => returns true

        phone.tick();       // simulate a minute going by
        phone.tick();       // simulate another minute going by

        phone.endCall();

        phone.call("555-2222");
        phone.tick();       // simulate a minute going by
        phone.tick();       // simulate a minute going by
        phone.tick();       // simulate a minute going by


        System.out.println(phone.isTalking());  // => returns false (because the call is over)
        System.out.println(phone.getHistory()); // => returns "555-1212 (2 minutes)"

        System.out.println(card3.getMinutesRemaining()); // => return 8, because the call lasted 2 minutes;
    }

}
