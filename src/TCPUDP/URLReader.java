package TCPUDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
    public static void main(String args[]) throws Exception{
        URL url = new URL("http://yayaquanzhidao.top/?ID=13&Pet=49");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.print(inputLine);
        in.close();
    }
}
