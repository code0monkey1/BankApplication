package utilities;

import java.util.Random;

public class RandomNumber {


    public static String lengthOfRandomNumber(int length) {
        if (length == 0) return "0";
        String representative = "0123456789";
        Random random = new Random();
        String s = "";
        for (int i = 0; i < length; i++) {
            s += representative.charAt(random.nextInt(representative.length()));
        }
        return s;
    }
}
