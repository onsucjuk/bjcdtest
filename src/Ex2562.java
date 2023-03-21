import java.util.ArrayList;
import java.util.Scanner;

public class Ex2562 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < 9; i++) {
            int b = sc.nextInt();
            al.add(b);
        }

        int max = al.get(0);

        for (int j = 0; j < 9; j++) {

            if (al.get(j) > max)

                max = al.get(j);

        }

        System.out.println(max);
        System.out.print(al.indexOf(max) + 1);

    }
}
