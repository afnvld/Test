package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        Properties prop = new Properties();
        String path = "/" + System.getenv("Configuration");
        FileInputStream fis = new FileInputStream(new File(path));
        prop.load(fis);

        String test = prop.getProperty("test");

        System.out.println(test);
    }
}
