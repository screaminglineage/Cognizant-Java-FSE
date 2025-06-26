public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static String getGreeting(String name) {
        if (name == null) {
            return null;
        } else {
            return "Hello, " + name + "!";
        }
    }
}
