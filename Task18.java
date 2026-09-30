import java.util.Scanner;

// Ədəd oxu, while ilə rəqəmlərinin sayını tap.
public class Task18 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int eded = a.nextInt();
        int say = 0;
        while(eded >0){
            eded=eded/10;
            say++;
        }
        System.out.println(say);
    }
}
