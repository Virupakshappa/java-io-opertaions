import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileOutputDemo {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        OutputStream os = new FileOutputStream("application.properties");

prop.setProperty("url", "localhost:7000/myDb");
prop.setProperty("uname", "Veeru");
prop.setProperty("pass", "77777");

prop.store(os, null);
    }
}
