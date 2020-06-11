package other;

import java.net.MalformedURLException;
import java.net.URL;

//对URL进行操作
public class UrlTest {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://github.com/LemonYu997/Study-Java/blob/master/chapter1/HelloWorld.java");
        System.out.println("URL         : " + url.toString());
        System.out.println("protocol    : " + url.getProtocol());
        System.out.println("authority   : " + url.getAuthority());
        System.out.println("file name   : " + url.getFile());
        System.out.println("host        : " + url.getHost());
        System.out.println("path        : " + url.getPath());
        System.out.println("port        : " + url.getPort());           //由于实例没有设置端口号，返回-1
        System.out.println("default port: " + url.getDefaultPort());
        System.out.println("query       : " + url.getQuery());
        System.out.println("ref         : " + url.getRef());
    }
}
