public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData(String username, String password) {
        return api.getData(username, password);
    }
}
