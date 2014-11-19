public class GuesserTest {
    public static boolean guessed = false;

    @org.junit.Test public void test() {
        new Guesser().guess();
        org.junit.Assert.assertTrue(guessed);
    }
}
