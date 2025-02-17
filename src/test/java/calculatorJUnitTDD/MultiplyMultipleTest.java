package calculatorJUnitTDD;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyMultipleTest extends TestCase {

    @Test
    public void testMultiply() {

        //Arrange
        MultiplyMultiple mult = new MultiplyMultiple();
        int[] numbs = {1,2,3,4,5};
        System.out.println(numbs);
        int[] numbs1 = {1,5};
        int[] numbs2 = {-1,4};


        //Act
        int product = mult.multiply(1,2,3,4,5);

        //Assert
        assertEquals(120, product);
        Assert.assertEquals(3, product);
        //assertEquals(-3, product);
    }
}