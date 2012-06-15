import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 6/14/12
 * Time: 12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    public static void main(String[] argv) throws IOException {
        BufferedReader buff = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("What's your good name Srimaan ji ? ");
        System.out.flush();
        String s = buff.readLine();
        System.out.printf("Namastay ji Srimaan athwa Srimathi ji, %s!", s);
    }
}
