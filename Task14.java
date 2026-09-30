import java.util.Scanner;

//n oxu, 1-dən n-ə qədər neçə cüt ədəd olduğunu say
public class Task14 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int say = 0;
        for (int i = 1;i<=n;i++){
            if (i%2==0){
                say+=1;
            }

        }
        System.out.println(say);
    }
}
