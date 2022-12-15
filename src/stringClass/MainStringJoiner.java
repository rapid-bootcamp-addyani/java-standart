package stringClass;

import java.util.StringJoiner;

public class MainStringJoiner {
    public static void main(String[] args) {
        String[] names = {"Siti", "Fadilah", "Supti"};
        StringJoiner joiner = new StringJoiner(" - ", "{","}");

        System.out.println("Sebelum add: ");
        System.out.println(joiner.toString());

        for(String name: names) {
            joiner.add((name));
        }
        System.out.println("Sesudah Joiner: ");
        System.out.println(joiner.toString());
    }
}
