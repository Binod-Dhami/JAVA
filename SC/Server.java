package SC;
import java.net.*;
import java.io.*;

    public class Server
    {
        public static void main(String[]args)throws IOException
        {
            ServerSocket ss=new ServerSocket(6000);
            System.out.println("Server is running.");
            Socket cs=ss.accept();
            System.out.println("Client is connected");
            PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
            BufferedReader in =new BufferedReader(new InputStreamReader(cs.getInputStream()));
            String inputLine;
            while((inputLine=in.readLine())!=null)
            {
                if(isPalindrom(inputLine))
                {
                    out.println(" String ispalindrom");
                }
                else
                {
                    out.println(" String is not palindrom");
                }
            }
        }
        public static boolean isPalindrom(String s)
        {
            int i=0,j=s.length() -1;
            while(i<j)
            {
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }

    }