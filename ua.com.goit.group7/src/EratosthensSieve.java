import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratosthensSieve {

    public static final int P = 2;

    private List<Integer> primeNumbers = new ArrayList<Integer>();
    private int n;

    public EratosthensSieve(int n) throws Exception {

        // Check if value greater than 2
        if(n-P <= 0){
            throw new Exception("Number should be greater than 2");
        }

        this.n = n;
    }

    /**
     * Set result in private property
     */
    public void findPrimeNumbers(){
        boolean [] numbers = new boolean[this.n +1];

        Arrays.fill(numbers,true);

        numbers[0]= numbers[1]=false;

        for (int i = P; i< numbers.length; i++) {
            if(numbers[i]) {
                for (int j = P; i*j < numbers.length; j++) {
                    numbers[i*j]=false;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == true){
                this.primeNumbers.add(i);
            }
        }

    }

    /**
     * Print out result of finding values
     */
    public void showPrimeNumbers(){
        for(Integer i : this.primeNumbers){
            System.out.print(i + " ");
        }
    }


    /**
     * Get result List
     * @return
     */
    public List<Integer> getPrimeNumbers() {
        return primeNumbers;
    }
}