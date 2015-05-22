package utils;

/**
 * Created by Jackson on 22.05.2015.
 */
public class DataUtils {

    public static boolean isStringEmpty(String string) {
        if (string == null) {
            return true;
        }
        return string.isEmpty();
    }

}
