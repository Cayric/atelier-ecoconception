import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Brouillage2Test {

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test @Order(1)
    public void sampleTests() {
        testing(Brouillage2.brouilleur("'fpcjmrain'","cnam"), true);
        testing(Brouillage2.brouilleur("jqesrdhqmsidmehlaozjssjsuz","memoire"),true);
        testing(Brouillage2.brouilleur("katas","steak"),false);
        testing(Brouillage2.brouilleur("scriptjavx","javascript"),false);
        testing(Brouillage2.brouilleur("scriptingjava","javascript"),true);
        testing(Brouillage2.brouilleur("scriptsjava","javascripts"),true);
        testing(Brouillage2.brouilleur("javscripts","javascript"),false);

    }

    @Test @Order(2)
    public void largeTest() {

        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);

        testing(Brouillage2.brouilleur(s1, s2), true);
    }

}