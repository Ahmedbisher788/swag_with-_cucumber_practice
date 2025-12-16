package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataUtils {
    static String testDataPath = "src/test/resources/testData/";


    public static String getPropertyValue(String filename, String key) throws IOException {
        try {
            Properties property = new Properties();
            property.load(new FileInputStream(testDataPath + filename + ".properties"));
            return property.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


}
