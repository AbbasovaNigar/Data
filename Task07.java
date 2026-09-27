import java.util.Scanner;

public class Task07 {
    public static void main(String[] args){
        Scanner eded = new Scanner(System.in);
        int a = eded.nextInt();
        if (a > 0){
            System.out.println("eded musbetdi");
        }
        if ( a < 0 ){
            System.out.println("eded menfidi");

        }
        if ( a == 0){
            System.out.println("eded 0 dir");
        }
    }
}
