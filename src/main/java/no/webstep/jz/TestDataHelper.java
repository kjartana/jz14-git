package no.webstep.jz;

import java.util.Random;

/**
 * Hello world!
 */
public class TestDataHelper {

    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String randomWhatever() {
        if (1 == 1) {
            return "nice";
        } else {
            return "seriously";
        }
    }

    private static String range(int lower, int upper) {
        return String.valueOf(random.nextInt(upper - lower) + lower);
    }

    public static String randomOrgNum() {
        return "9";
        //return range(900000000, 999999999);
    }


}
