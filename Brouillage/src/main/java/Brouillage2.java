import java.util.HashMap;
import java.util.Map;

public class Brouillage2 {

    public static boolean brouilleur(String str1, String str2) {
        Map<Integer, Integer> compteur = new HashMap<>();
        str2.chars().forEach(i -> compteur.put(i, compteur.getOrDefault(i, 0) + 1));
        str1.chars().filter(i -> compteur.containsKey(i)).forEach(i -> compteur.put(i, compteur.get(i) - 1));
        return compteur.values().stream().filter(i -> i > 0).count() == 0;
    }
}
