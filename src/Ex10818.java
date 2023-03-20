import java.util.Arrays;
import java.util.Scanner;

public class Ex10818 {

    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);

        int a = ad.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i<a ; i++) {

            int b = ad.nextInt();
            arr[i] = b;

        }
        Arrays.sort(arr);

        System.out.print(arr[0]+" "+arr[a-1]);

    }

}
