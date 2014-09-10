package no.webstep.jz;

import com.google.common.base.Strings;

import java.util.Random;

/**
 * Hello world!
 */
public abstract class TestDataHelper {

    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String randomWhatever() {
        return "still around";
    }

    static String range(int lower, int upper, int minLength) {
        String r = String.valueOf(random.nextInt(upper - lower) + lower);
        r = Strings.repeat("0", minLength - r.length()) + r;
        return r;
    }

    public static String randomSsn() {
        return range(0, 31, 2) + range(0, 12, 2) + range(0, 99, 2) + range(10000, 99999, 5);
    }

    public static String randomOrgNum() {
        return "9";
        //return range(900000000, 999999999, 9);
    }


}
