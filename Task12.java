import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

//1-4 arası ədəd oxu, sadə kalkulyator menyusu göstər: 1→toplama, 2→çıxma, 3→vurma, 4→bölmə adını çap et
public class Task12 {
    public static void main(String[] args){
        System.out.print("Reqem daxil edin :");
        Scanner a = new Scanner(System.in);
        int reqem = a.nextInt();
        switch (reqem){
            case 1:
                System.out.print("->toplama");
                break;
            case 2:
                System.out.print("->cixma");
                break;
            case 3:
                System.out.print("->vurma");
                break;
            case 4:
                System.out.print("->bolme");
            default:
                System.out.print("sef reqem");
        }


    }
}
