import java.util.Arrays;

public class ZhuTakaokaAlgorithm {

    public static void findOccurrences(String text, String[] pattern) {

        Arrays.sort(pattern);

        int[] counter = new int[pattern.length];

        for (int i = 0; i <= text.length() - pattern[0].length(); i++) {

            for (int j = 0; j < pattern.length; j++) {

                if (pattern[j].equals(text.substring(i, i + pattern[j].length()))) {

                    counter[j]++;

                    i += pattern[j].length() - 1;
                    break;
                }
            }
        }

        for (int i = 0; i < pattern.length; i++) {

            System.out.println("Kelime: " + pattern[i] + " - Geçiş sayısı: " + counter[i]);
        }
    }
}
