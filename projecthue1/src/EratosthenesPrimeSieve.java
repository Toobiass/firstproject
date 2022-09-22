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
        if(p==0)
        {
            return false;
        }
        for (int i = 2; i < p; i++)
        {
            if (p % i == 0)
            {
                return false;
            }
        }
        if(primes.contains(p))
        {
            return true;
        }
        primes.add(p);
        return true;
    }

    @Override
    public void printPrimes()
    {
        for(int p:primes)
        {
            System.out.println(p);
        }
    }
}
