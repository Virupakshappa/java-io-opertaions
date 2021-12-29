import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class FileInputDemo {
    public static void main(String[] args) throws Exception{
        Properties pro = new Properties();
        InputStream is = new FileInputStream("application.properties");

        pro.load(is);
        System.out.println(pro.getProperty("url"));
        System.out.println("==========================");
        pro.list(System.out);
    }
}
