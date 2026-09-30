import java.util.Scanner;

//n oxu, 1-dən n-ə qədər ədədlərin cəmini tap.
public class Task13 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int cem = 0;
        for (int i = 1;i <= n;i++){
            cem+=i;

        }
        System.out.println(cem);
    }
}
