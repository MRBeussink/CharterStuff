import java.util.stream.IntStream;

public class AnagramChecker {

    static boolean check(String a, String b) {

        if (a.length() != b.length()) return false;

        int[] aa = a.toLowerCase().chars().sorted().toArray();
        int[] bb = b.toLowerCase().chars().sorted().toArray();

        for (int i = 0; i < aa.length; i++) {
            if (aa[i] != bb[i]) return false;
        }

        return true;
    }
}