import java.util.Scanner;

//while ilə istifadəçidən ədəd al, 0 yazana qədər davam et, neçə ədəd daxil etdiyini çap et.
public class Task17 {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        int eded = a.nextInt();
        int say = 0;
        while (eded!=0){
            say++;
            eded=a.nextInt();
        }
        System.out.println(say);
    }

}
