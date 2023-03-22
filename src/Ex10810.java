import java.util.Scanner;

public class Ex10810 {

    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);

        int a = ad.nextInt();
        int b = ad.nextInt();
        int[] arr = new int[a];

        for (int z = 0; z < a; z++) {

            arr[z] = 0;

        }



        for(int i = 0; i<b; i++) {

            int c = ad.nextInt();
            int d = ad.nextInt();
            int e = ad.nextInt();

            for(int k=c-1 ; k<=d-1; k++) {

                arr[k]=e;

            }

        }

        for(int x = 0; x<a; x++){

            System.out.print(arr[x]+" ");

        }

    }

}
