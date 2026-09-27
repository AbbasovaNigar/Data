import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner reqem = new Scanner(System.in);
        int a = reqem.nextInt();
        if (a % 2 == 0) {
            System.out.println("cutdu");

        }
        if (a % 2 != 0) {
            System.out.println("tekdi");
        }

    }
}