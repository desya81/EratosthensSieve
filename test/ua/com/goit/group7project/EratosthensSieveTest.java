package test.ua.com.goit.group7project;

import org.junit.Assert;
import org.junit.Test;
import ua.com.goit.group7project.EratosthensSieve;

import java.util.ArrayList;
import java.util.List;


public class EratosthensSieveTest {


    @Test (timeout = 3000)
    public void testGetPrimeNumbers() throws Exception {
        final int n = 5;
        final List<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        final EratosthensSieve eratosthensSieve = new EratosthensSieve(n);
        eratosthensSieve.findPrimeNumbers();
        final List<Integer> result = eratosthensSieve.getPrimeNumbers();
        Assert.assertEquals(primeNumbers, result);

    }

    @Test (timeout = 3000)
    public void testGetPrimeNumbers1() throws Exception {
        final int n = 30;
        final List<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);
        primeNumbers.add(17);
        primeNumbers.add(19);
        primeNumbers.add(23);
        primeNumbers.add(29);
        final EratosthensSieve eratosthensSieve = new EratosthensSieve(n);
        eratosthensSieve.findPrimeNumbers();
        final List<Integer> result = eratosthensSieve.getPrimeNumbers();
        Assert.assertEquals(primeNumbers, result);

    }
}