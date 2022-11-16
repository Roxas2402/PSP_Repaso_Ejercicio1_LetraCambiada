import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        frase = frase.toLowerCase().replace('e', 'a');
        StringTokenizer st = new StringTokenizer(frase);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("FIN");
    }
}