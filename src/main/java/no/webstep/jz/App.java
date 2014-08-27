package no.webstep.jz;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean methodWithSomeBugs() {
        java.util.Random r = new java.util.Random();
        return r.nextInt() % 2 == 0;
    }
}
