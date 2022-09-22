import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{
    int obergrenze;
    ArrayList<Integer> primes = new ArrayList<>();

    public EratosthenesPrimeSieve(int og) {
        obergrenze = og;
    }
    @Override
    public boolean isPrime(int p)
    {
        return true;
    }

    @Override
    public void printPrimes()
    {

    }
}
