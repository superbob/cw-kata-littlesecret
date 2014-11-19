/**
 * Created by florianmorgan on 19/11/2014.
 */
public class LittleSecret {
    private static String secret = "notVeryWellProtected";

    public static void isMySecret(String guess) {
        if (secret.equals(guess)) {
            System.out.println("How did you found my secret ?!?");
            GuesserTest.guessed = true;
        } else {
            System.out.println("Try again");
        }
    }
}
