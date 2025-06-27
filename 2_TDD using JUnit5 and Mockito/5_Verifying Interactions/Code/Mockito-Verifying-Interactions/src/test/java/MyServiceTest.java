import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class MyServiceTest {
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData("abcd", "1234");
        verify(mockApi).getData("abcd", "1234");
    }
}