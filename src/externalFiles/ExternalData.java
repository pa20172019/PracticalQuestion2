package externalFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExternalData {
     public static void main(String[] args) throws IOException {
         String path =("data\\config.properties");

         Properties prop = new Properties();

         FileInputStream fi = new FileInputStream(path);

         prop.load(fi);

         System.out.println(prop.getProperty("One"));
         System.out.println(prop.getProperty("Two"));
         System.out.println(prop.getProperty("Three"));

    }
}
