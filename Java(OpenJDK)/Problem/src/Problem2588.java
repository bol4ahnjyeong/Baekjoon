import java.util.Scanner;

public class Problem2588 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = A * (B % 10);
        int D = A * ((B % 100) / 10);
        int E = A * (B / 100);
        int F = C + D * 10 + E * 100;

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);

    }

}