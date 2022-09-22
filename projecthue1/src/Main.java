import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> numbers;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Obergrenze für den Primzahlenrechner:");
        int og = Integer.parseInt(s.nextLine());
        EratosthenesPrimeSieve ogtogive = new EratosthenesPrimeSieve(og);
        numbers = new ArrayList<>();

        for (int i = 2; i <= ogtogive.obergrenze; i++) {
            numbers.add(i);
        }
        int wtrue =0;
        while(wtrue< ogtogive.obergrenze)
        {
            primesieve(numbers, ogtogive);
            wtrue++;
        }
        ogtogive.printPrimes();

    }
    public static void primesieve(ArrayList<Integer> list, EratosthenesPrimeSieve og) {
        for (int i : list) {
            if (og.isPrime(i)) {
                int copy = i;
                int multi = 2;
                int t = 0;
                while (t < og.obergrenze - 1) {

                    t = copy * multi;
                    if (t > og.obergrenze)
                    {
                        break;
                    }
                    multi++;
                    if(numbers.contains(t))
                    {Integer integer = t;numbers.remove(integer);
                        return;
                    }
                }
            }
        }
    }
}