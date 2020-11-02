package stringchar;
import java.util.Scanner;
public class StringChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = "bib";
        System.out.println("Ener string");
        String s2 = s.nextLine();
        String[] sarr = s2.split(" ");
        char[] arr = s1.toCharArray();
        int x = 0, y = 0;
        x = s1.length();
        for (String s3 : sarr) {
            y = 0;
            for (char c : arr) {
                int i = s3.indexOf(c);
                if (i == -1) {
                    break;
                }
                y++;
            }
            if (x == y) {
                System.out.println(s3);
            }
        }
    }
}
