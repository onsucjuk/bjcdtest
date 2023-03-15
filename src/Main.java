import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);

        int a = ad.nextInt();

        for (int j = 1; j <= a; j++) {

            for (int b = 0; b < j; b++) {

                System.out.print("*");

            }
            System.out.println("");
        }
    }
}

