import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class EratosthensSieveTest {

    private EratosthensSieve eratosthensSieve;
    private List<Integer> expected;


    public EratosthensSieveTest(int range, List<Integer> expected) throws Exception {
        this.expected = expected;
        this.eratosthensSieve = new EratosthensSieve(range);
    }

    @Parameterized.Parameters
    public static Object[][] dataProviderAdd() {

        Object[][] tests = new Object[][] {
                {5, Arrays.asList(2, 3, 5)},
                {30, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)},
        };

        return tests;
    }

    @Test
    public void testGetPrimeNumbers() throws Exception {
        this.eratosthensSieve.findPrimeNumbers();
        Assert.assertEquals(this.expected, this.eratosthensSieve.getPrimeNumbers());
    }
}