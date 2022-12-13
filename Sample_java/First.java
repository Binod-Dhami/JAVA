package Sample_java;
import java.util.Scanner;
class Sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is:"+sum);

    }
}