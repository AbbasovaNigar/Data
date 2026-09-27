import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner reqem = new Scanner(System.in);
        int a = reqem.nextInt();
        int b = reqem.nextInt();
        int c = reqem.nextInt();
        if (b < a && c < a) {
            System.out.println("a boyukdu");

        }
        if (b<c && a<c) {
            System.out.println("c boyukdu");
        }
        if (c<b && a<b){
            System.out.println("b boyukdu");
        }
    }
}