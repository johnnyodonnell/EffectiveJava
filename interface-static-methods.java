
/*
 * From p. 7
 *
 * """
 * Prior to Java 8, interfaces couldn't have static methods
 * """
 *
 */

interface AnotherInterface {
    static void print(String message) {
        System.out.println(message);
    }
}

interface Interface {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        AnotherInterface.print("Hello from Another Interface.");
    }
}

