package calculatorJUnitTDD;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AddMultipleTest extends TestCase {

    @Test
    public void testAddMultiple() {

        //Arrange
        AddMultiple addMany = new AddMultiple();
        int[] numbs = {1,2,3,4,5};
        System.out.print(numbs);
        int[] numbs1 = {1,5};
        int[] numbs2 = {-1,4};

        //Act
        int sum = addMany.addMultiple(1,2,3,4,5);

        //Assert
        //Assert.fail();
        assertEquals(15, sum);
        assertEquals(3, sum);
        //assertEquals(-2, sum);
    }
}