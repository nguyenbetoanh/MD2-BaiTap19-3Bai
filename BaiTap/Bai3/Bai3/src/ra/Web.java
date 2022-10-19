package ra;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Web {
    public static void main(String[] args) {
            try {
                URL url = new URL("https://dantri.com.vn/the-gioi.htm");
                InputStreamReader isr=new InputStreamReader(url.openStream());
                Scanner sc=new Scanner(isr);
                sc.useDelimiter("\\Z");
                String content=sc.next();
                content=content.replaceAll("\\n","");
                content=content.replaceAll("\\&qout[\\;]?+","");
                content=content.replaceAll("\\<\\/a\\>","");
                Pattern p = Pattern.compile("article-title\">(.*?)<h3");
                Matcher m=p.matcher(content);
                while (m.find()){
                    String str=m.group(1);
                    str=str.replaceAll("\\&quot\\;","");
                    String[] arrStr =str.split("htm\">");
                    System.out.println(arrStr[1]);
                    System.out.println(str);

                }
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
    }

