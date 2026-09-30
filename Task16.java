import java.util.Scanner;

//Bir ədəd oxu, onun 1-dən 10-a qədər vurma cədvəlini çap et
public class Task16 {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n = a.nextInt();
        //for (int i =i;i<=n;i++){
            System.out.println("1*"+n+"="+n*1);
            System.out.println("2*"+n+"="+n*2);
            System.out.println("3*"+n+"="+n*3);
            System.out.println("4*"+n+"="+n*4);
            System.out.println("5*"+n+"="+n*5);
            System.out.println("6*"+n+"="+n*6);
            System.out.println("7*"+n+"="+n*7);
            System.out.println("8*"+n+"="+n*8);
            System.out.println("9*"+n+"="+n*9);
            System.out.println("10*"+n+"="+n*10);

        }
    }

