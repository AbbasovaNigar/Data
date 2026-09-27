//hefdenin gunlerini tapir

import java.util.Random;

public class Task10 {
    public static void main(String[] args){
        Random gun = new Random();
        int x = gun.nextInt(1,8);
        System.out.println("hefdenin "+ x + " gunudu");
        if (x==1){
            System.out.println("Bazar ertesi");
        }
        if (x==2){
            System.out.println("Cersenbe axsami");
        }
        if (x==3){
            System.out.println("Cersenbe");
        }
        if (x==4){
            System.out.println("Cume axsami");
        }
        if (x==5){
            System.out.println("Cume");
        }
        if (x==6){
            System.out.println("Senbe");
        }
        if (x==7){
            System.out.println("Bazar");
        }
    }
}
