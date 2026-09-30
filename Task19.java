import java.util.Scanner;

//Ədəd oxu, while ilə tərsinə çevir (1234 → 4321).
public class Task19 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int eded = a.nextInt();
        int ters =0;
        while (eded>0){
            int qaliq = eded%10;
            ters=ters*10+qaliq;
            eded/=10;
        }
        System.out.println(ters);
    }
}
