import java.util.Scanner;

//n factoriali tap
public class Task15 {
    public static void main(String[] args){
        Scanner a =new Scanner(System.in);
        int n = a.nextInt();
        int factorial=1;
        for (int i =1;i<=n; i++){
            factorial*=i;
        }
        System.out.println(factorial);

    }
}
