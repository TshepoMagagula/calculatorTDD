package calculatorJUnitTDD;

public class AddMultiple {

    //Add function that handles multiple integers

    public static int addMultiple(int... numbs) {
        int sum = 0;
        for (int num : numbs) {
            sum += num;
        }
        return sum;
    }
}
