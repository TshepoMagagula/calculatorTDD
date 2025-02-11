package calculatorJUnitTDD;

public class MultiplyMultiple {

    //Multiply function that handles multiple integers
    public static int multiply(int... numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }
}
