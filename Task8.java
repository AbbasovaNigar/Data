import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner yas = new Scanner(System.in);
        int a = yas.nextInt();
        if (a>0 && a< 12){
            System.out.println("usaqdi");
        }
        if (a>13 && a<17){
            System.out.println("yeniyetmedi");
        }
        if (a>18){
            System.out.println("boyuk adamdi");
        }
    }
}
