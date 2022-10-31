import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BrouillageTest {

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test @Order(1)
    public void sampleTests() {
        testing(Brouillage.brouilleur("'fpcjmrain'","cnam"), true);
        testing(Brouillage.brouilleur("jqesrdhqmsidmehlaozjssjsuz","memoire"),true);
        testing(Brouillage.brouilleur("katas","steak"),false);
        testing(Brouillage.brouilleur("scriptjavx","javascript"),false);
        testing(Brouillage.brouilleur("scriptingjava","javascript"),true);
        testing(Brouillage.brouilleur("scriptsjava","javascripts"),true);
        testing(Brouillage.brouilleur("javscripts","javascript"),false);

    }

    @Test @Order(2)
    public void largeTest() {

        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);

        testing(Brouillage.brouilleur(s1, s2), true);
    }

}