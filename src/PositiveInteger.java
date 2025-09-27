import java.util.ArrayList;
import java.util.List;
import java.lang.Math.*;

public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    /*
    Method: return an int array, where res[0] has the sum of factors, res[1] counts the number of factors
    if the number is 1, return 0 for the sum
     */
    private int getSum() {
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) { // i is a factor of num
                sum += i;
                if (i != num / i && num != num / i) {
                    // if i is a factor, num / i is also a factor
                    sum += num / i;
                }
            }
        }
        return sum;
    }

    /*
    Method: check if the sum of all factors is equal to the number itself -> if so, perfect number
     */
    public boolean isPerfect() {
        int sum = getSum();
        if (num == 1) {
            return false;
        }

        return sum == num;
    }

    /*
    Method: check if the sum of all factors is larger than the number itself -> if so, abundant number
     */
    public boolean isAbundant() {
        int sum = getSum();
        if (sum > num) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Method: check if the sum of its own digits raised to power n equal to the number itself
     */
    public boolean isNarcissistic() {
        int count = 0;
        double sum = 0;
        int input = num;
        List<Integer> list = new ArrayList<>();

        while (input > 0) {
            // acquire each digit
            int temp = input % 10;
            list.add(temp);
            // increment the total number of digits
            count++;
            input /= 10;
        }

        for (int i = 0; i < list.size(); i++) {
            // compute the sum
            sum += Math.pow(list.get(i), count);
        }

        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

}


