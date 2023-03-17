import java.util.Scanner;

public class Ex10807 {


    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);

        int a = ad.nextInt();
        int c = 0;

        int[] list = new int[a + 1];

        for (int i = 0; i < a + 1; i++) {

            list[i] = ad.nextInt();

        }

        for (int j = 0; j < a; j++) {

            if (list[j] == list[a]) {

                c = c + 1;

            }

        }

        System.out.println(c);

    }
}