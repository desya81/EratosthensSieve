import java.util.Arrays;

public class EratosthensSieve {

    public static final int P = 2;
    private boolean [] primeNumbers;
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
        this.primeNumbers = new boolean[this.n];

        Arrays.fill(this.primeNumbers,true);

        this.primeNumbers[0]=this.primeNumbers[1]=false;

        for (int i=P; i<this.primeNumbers.length; i++) {
            if(this.primeNumbers[i]) {
                for (int j=P; i*j <this.primeNumbers.length; j++) {
                    this.primeNumbers[i*j]=false;
                }
            }
        }
    }

    /**
     * Print out result of finding values
     */
    public void showPrimeNumbers(){
        for (int i = 0; i < this.primeNumbers.length; i++){
            if(this.primeNumbers[i] == true){
               System.out.print(i+ " ");
            }
        }
    }

}
