public class Logger {
    private static Logger instance;
    private Logger() {
        System.out.println("Created Logger");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String type, String message) {
        System.out.printf("[%s]: %s\n", type, message);
    }
}
