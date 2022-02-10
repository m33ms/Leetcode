/*
204. Count Primes
Given an integer n, return the number of prime numbers that are strictly less than n.
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

public class CountPrimes {
    static int countPrimes(int n) {
        //sieve of Eratosthenes
        int count = 0;
        boolean[] primes = new boolean[n];

        //i=2 because 2 is first prime number
        //multiples of i will not be prime
        for(int i=2; i*i < primes.length; i++) {
            if(!primes[i]) {
                for(int j=i; j*i<primes.length; j++) {
                    //boolean by default is false, so set multiples of i to true
                    primes[i*j] = true;
                }
            }
        }

        for(int i=2; i<primes.length; i++){
            if(!primes[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("count: " + countPrimes(n));
    }
}
