package de.limago.streamtest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PrimeGenerator primeGenerator = new PrimeGenerator();
        primeGenerator.findPrimesUpTo(20).forEach(System.out::println);
    }
}
