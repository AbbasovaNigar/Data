import java.util.Scanner;

//Ədəd oxu, while ilə rəqəmlərinin cəmini tap (1234 → 10)
public class Task20 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n =a.nextInt();
        int cem = 0;
        while (n>0){
            cem+=n%10;
            n=n/10;
        }
        System.out.println(cem);
    }
}
