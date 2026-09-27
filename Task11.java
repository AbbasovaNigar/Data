//aylarin hansi fesil oldugunu tap

import java.util.Random;

public class Task11 {
    public static void main(String[] args){
        Random ay = new Random();
        int a = ay.nextInt(1,13);
        System.out.print(a+" ci ay -");
        switch(a){
            case 1:
            case 2:
            case 12:
                System.out.print("qis ayidi");
                break;
            case 4:
            case 5:
            case 3:
                System.out.print("yaz ayidi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("yay ayidi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("payiz ayidi");
                break;
        /*    if (a==1 || a==2 || a==12){
                System.out.print(" qis ayidi");
        }
            if (a==3||a==4||a==5){
                System.out.print(" yaz ayidi");
        }
            if (a == 6 || a ==7 || a==8){
                System.out.print(" yay ayidi");
        }
            if (a==9|| a==10 || a==11){
                System.out.print(" qis ayidi"); */
        }

    }


 }

