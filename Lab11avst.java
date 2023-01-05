// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bond  ==>>  ");
        final int MAX = input.nextInt();
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        for(int k = 0; k < primes.length; k++) {
            primes[k] = true;
        }
        outer:
            for(int k = 0; k < primes.length; k++) {
                for(int m = 2; m <= k/2; m++){
                    if(primes[m] == true){
                        if(k % m == 0){
                            primes[k] = false;
                            continue outer;
                        }
                    }
                }
            }


        System.out.println("\nCOMPUTING PRIME NUMBERS");

    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();


        DecimalFormat FourZeros = new DecimalFormat("0000");


        int line = 1;

        for(int k = 0; k < primes.length; k++) {
            if(primes[k] == true) {
                System.out.print(FourZeros.format(k) + " ");
                if(line == 15){
                    System.out.println();
                    line = 0;
                }
                line++;
            }
        }

    }

}



