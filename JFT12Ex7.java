public class JFT12Ex7 {

    public static void main (String[] args) {

        String message1 = "Message in a bottle";
        String message2 = "Message in a jar";
        String lm, sm;

        System.out.println("Message 1 length: " + message1.length());
        System.out.println("Message 2 length: " + message2.length());

        if(message1.length() > message2.length()) {

            lm = message1;
            sm = message2;
            System.out.println(lm + " is longer than " + sm);

        } else if (message1.length() < message2.length()) {

            lm = message2;
            sm = message1;
            System.out.println(lm + " is longer than " + sm);

        } else if (message1.length() == message2.length()) {

            System.out.println("Both messages are the same length.");

        }
    }
}
