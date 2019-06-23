public class JFT12Ex6 {

    public static void main (String[] args) {

        String userEnteredPassword = "javabeans";
        String password = "JAVABEANs";

        if(password.equalsIgnoreCase(userEnteredPassword) == true) {

            System.out.println("Log-on successful");

        } else {

            System.out.println("Password incorrect");

        }
    }
}
