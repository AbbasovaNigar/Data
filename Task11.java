//aylarin hansi fesil oldugunu tap

import java.util.Random;

public class Task11 {
    public static void main(String[] args){
        Random ay = new Random();
        int a = ay.nextInt(1,13);
        System.out.print(a+" ci ay -");
            if (a==1 || a==2 || a==12){
                System.out.print(" qis ayidi");
        }
            if (a==3||a==4||a==5){
                System.out.print(" yaz ayidi");
        }
            if (a == 6 || a ==7 || a==8){
                System.out.print(" yay ayidi");
        }
            if (a==9|| a==10 || a==11){
                System.out.print(" qis ayidi");
        }

    }
}
