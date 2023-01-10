package URL;

import java.net.*;
import java.io.*;  
public class HttpUrlConnection {
    public static void main(String []args)
    throws IOException{
        URL url=new URL("https://www.google.com.np/");
        HttpURLConnection cn=(HttpURLConnection)url.openConnection();
        InputStream in=cn.getInputStream();
        if(cn.getResponseCode()==HttpURLConnection.HTTP_OK){
        int content;
        while((content=in.read())!=-1){
            System.out.print((char)content);
        }
        in.close();
     }  
}
}
