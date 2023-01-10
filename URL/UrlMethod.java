package URL;
//import java.io.*;
import java.net.*;
public class UrlMethod {
    public static void main(String []args){
    try{
        URL url=new URL("http://xyz.com/path/file/search?name=binod#fb");
        System.out.println(" protocol"+url.getProtocol());
        System.out.println(" Domain/host"+url.getHost());
        System.out.println(" Aurthority"+url.getAuthority());
        System.out.println(" Port"+url.getPort());
        System.out.println(" Default port"+url.getDefaultPort());
        System.out.println(" Path"+url.getPath());
        System.out.println(" getfile"+url.getFile());
        System.out.println(" getQuery"+url.getQuery());
        System.out.println(" getRef"+url.getRef());
      //  System.out.println("URI"+url.geturi());
        System.out.println("getQuaryString"+url.getQuery());
    }
    catch(MalformedURLException e){
        System.out.println(e.getMessage());
    }
}
}