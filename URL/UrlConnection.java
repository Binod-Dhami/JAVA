package URL;
import java.net.*;
import java.io.*;  
public class UrlConnection {
    public static void main(String []args)
    throws IOException{
        URL url=new URL("https://www.google.com.np/");
        URLConnection cn=url.openConnection();
        InputStream in=cn.getInputStream();
        int content;
        while((content=in.read())!=-1){
            System.out.print((char)content);
        }
        in.close();
     }  
}
