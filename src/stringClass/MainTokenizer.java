package stringClass;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainTokenizer {
    public static void main(String[] args) {
        String name = "Siti Fadilah Suppri Sukarno Hatta";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        List<String > names = new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);

            names.add(token);
        }

        System.out.println("Penampilan Array List");
        System.out.println(names);
    }
}
