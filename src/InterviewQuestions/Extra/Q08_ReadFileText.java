package InterviewQuestions.Extra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 1)Create a text file inside this package
 2)Type the following text inside the text file
    Java is easy to learn.
    Learn Java, earn money?
    Java is easy if you study well.
    To learn Java, type codes.
 3)Type code to print every word is used how many times in the text.
*/
public class Q08_ReadFileText {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> wordCounter = new HashMap<>();
        List<String> lines = Files.readAllLines(Paths.get("src/Interview/Extra/Q08_FileText"));

        for (String w : lines) {
            String words[] = w.split(" ");//metni kelime kelime ayirir.
            for (String m : words) {
                if (m.endsWith(",") || m.endsWith(".") || m.endsWith("?") || m.endsWith("!")) {// noktalama isaretleri gormezden gelindi
                    m = m.substring(0, m.length() - 1);
                }
                if (!wordCounter.containsKey(m)) {//onceden bakilan kelime varsa sayisina 1 ekle.
                    wordCounter.put(m, 1);
                } else wordCounter.put(m, wordCounter.get(m) + 1);
            }
        }
        System.out.println("WorldCounter: " + wordCounter);
//WorldCounter: {Java=4, codes=1, study=1, learn=2, is=2, type=1, easy=2, money=1, earn=1, well=1, Learn=1, to=1, To=1, if=1, you=1}
    }
}