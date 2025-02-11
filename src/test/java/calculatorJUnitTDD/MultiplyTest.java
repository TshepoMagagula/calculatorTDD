package calculatorJUnitTDD;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest extends TestCase {

    // Step 3: Test for multiplying two integers

    @Test
    public void testMultiply() {

        //Arrange
        Multiply multply = new Multiply();
        int a = -1;
        int b = -1;

        //Act
        int product = multply.multiply(a, b);

        //Assert
        Assert.assertEquals(3, product);
        Assert.assertEquals(-2, product);

    }
}