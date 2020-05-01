import java.util.Scanner;

public class Problem2884 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int M = s.nextInt();

        if (M >= 45) M -= 45;
        else {

            M += 15;

            if (H > 0) H -= 1;
            else H = 23;

        }

        System.out.println(H + " " + M);

    }

}