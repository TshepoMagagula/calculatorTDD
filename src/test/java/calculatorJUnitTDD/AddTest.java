package calculatorJUnitTDD;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AddTest extends TestCase {

    @Test
    public void testAdd() {

        // Step 1: Test for adding two integers

        //Arrange
        Add addNumbs = new Add();
        int a = -1;
        int b = -1;

        //Act
        int sum = addNumbs.add(a, b);

        //Assert
        Assert.assertEquals(3, sum);
        Assert.assertEquals(-2, sum);
        Assert.fail();

    }
}