import java.util.Scanner;

public class EratosthensSieveRunner {

    public static void main(String[] args) {

        // Use infinity loop that if we receive exception, we will try enter value again
        while(true){

            try{
                int n = userPromt();
                EratosthensSieve sieve = new EratosthensSieve(n);
                sieve.findPrimeNumbers();
                sieve.showPrimeNumbers();
                break;
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Get User value from console
     * @return
     * @throws Exception
     */
    private static int userPromt() throws Exception {
        System.out.println("Please, enter a number");
        final Scanner scanner = new Scanner(System.in);
        int value;
        try {
            value = scanner.nextInt();
        }catch (Exception e){
            throw new Exception("Please enter numeric value");
        }
        return value;
    }
}
