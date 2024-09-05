import java.util.*;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Jayendra Yadav");

        for (int i = 0; i <= s.length() / 2; i++) {
            int front = i;
            int back = s.length() - 1 - i;
           Character frontChar = s.charAt(front);
           Character backChar = s.charAt(back);
            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);
        }
        System.out.println(s);
    }
}
