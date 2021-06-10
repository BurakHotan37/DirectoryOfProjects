package inJava.JUnitTest.MovieRental;

import inJava.JUnitTest.MovieRental.Customer;
import inJava.JUnitTest.MovieRental.Movie;
import inJava.JUnitTest.MovieRental.Rental;
import org.junit.Test;

import static org.junit.Assert.*;


public class TRental
{
    @Test
    public void TestIt() {

        String compString = "Rental Record for Peter Sauer\n" + "	Avatar	6.0\n" + "Amount owed is 6.0 Euros\n"
                + "You earned 2 frequent renter points";

        Customer cs1 = new Customer("Peter Sauer");
        Movie movieNewRent = new Movie("Avatar", 1);

        Rental newRental = new Rental(movieNewRent, 2);

        cs1.addRental(newRental);

        System.out.println("  comparing classes to eachother");
        System.out.println(cs1.statement());
        System.out.println(compString);
        assertEquals(cs1.statement(), compString);

    }


    @Test
    public void negativeSumdetection()
    {

    }
}
