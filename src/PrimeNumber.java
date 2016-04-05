/**
 * Created by lalwa_000 on 14/02/2016.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        for(int i=2 ;i<=20;i++)
            System.out.println("Is "+i +" a Prime number ? "+ pn.isPrime(i));

    }
    boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
