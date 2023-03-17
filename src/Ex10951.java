import java.util.Scanner;
public class Ex10951 {

    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);

        while(ad.hasNextInt()) {

            int a = ad.nextInt();
            int b = ad.nextInt();


            System.out.println(a+b);

        }

        ad.close();

    }

}
