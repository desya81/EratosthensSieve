import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EratosthensSieveTestException {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testException() throws Exception {
        exception.expect(Exception.class);
        exception.expectMessage("Number should be greater than 2");
        new EratosthensSieve(2);
    }
}