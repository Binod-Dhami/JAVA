package SC;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[]args)throws IOException{
        Socket cs=new Socket("localhost",6000);
        PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
        BufferedReader in =new BufferedReader(new InputStreamReader(cs.getInputStream()));
        Scanner sc=new Scanner(System.in);
        String input;
        while(true){
            System.out.print("enter  string to check:");
            input=sc.nextLine();
            out.println(input);
            System.out.println(in.readLine());
        }
    }
}