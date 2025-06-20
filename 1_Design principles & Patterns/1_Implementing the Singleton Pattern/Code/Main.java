public class Main {
    public static void main(String[] args) {
        Logger a = Logger.getInstance();
        a.log("MESSAGE", "Logging some data");

        Logger b = Logger.getInstance();
        b.log("ERROR", "Some error occured");

        Logger c = Logger.getInstance();
        c.log("WARNING", "Something went wrong");

        if (a == b && b == c) {
            System.out.println("Only a single instance of Logger exists");
        }
    }
}
