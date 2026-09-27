import java.util.Random;
//ballara gore qiymeti
public class Task09 {
    public static void main(String[] args){
        Random eded = new Random();
        int x = eded.nextInt(101);
        System.out.println("sizin baliniz :  "+ x);
        int bal = x /10;
        switch (bal){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
        }


    }
}
