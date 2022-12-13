package Sample_java;
import java.util.Scanner;
class Print_natural_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        if(num<=14){
            num++;
            System.out.println(num);   
        }
        else{
        System.out.println("you enter the wrong message");
        }
    }
}
