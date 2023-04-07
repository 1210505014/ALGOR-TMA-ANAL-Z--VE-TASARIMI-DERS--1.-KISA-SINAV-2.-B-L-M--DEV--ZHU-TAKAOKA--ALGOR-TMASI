import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Searching {

    public void search() {

        System.out.println("Zhu-Takaoka algoritması ile 'Alice in Wonderland' hikayesinde kelime arama algoritmaları");
        System.out.println("Aranan kelimeler: ");
        System.out.println("1- upon");
        System.out.println("2- sigh");
        System.out.println("3- Dormouse");
        System.out.println("4- jury-box");
        System.out.println("5- swim");

        String[] wordsArray = {"upon", "sigh", "Dormouse", "jury-box", "swim"};

        String txtPath = "C:\\Users\\bahar\\OneDrive\\Masaüstü\\ks1\\codes\\ks-1.2\\ZhuTakaoka-Algoritması\\ZhuTakaokaAlgorithm\\alice_in_wonderland.txt";

        Path filePath = Path.of(txtPath);

        String story = null;

        try {

            story = Files.readString(filePath);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

        ZhuTakaokaAlgorithm.findOccurrences(story, wordsArray);
    }
}
