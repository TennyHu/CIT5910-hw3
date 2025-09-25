public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    /*
    Method: return an int array, where res[0] has the sum of factors, res[1] counts the number of factors
    if the number is 1, return 0 for the sum
     */
    public int[] getSum() {
        int sum = 0;
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) { // i is a factor of num
                sum += i;
                count++;
                System.out.println("factor is: " + i);
                if (i != num / i && num != num / i) {
                    // if i is a factor, num / i is also a factor
                    sum += num / i;
                    count++;
                    System.out.println("factor is: " + num/i);
                }
            }
        }
        if (sum == 1) {
            sum = 0;
        }
        System.out.println("count is: " + count);
        return new int[]{sum, count};
    }

    public int[] getFactors() {
        int count = getSum()[1];
        int[] factors = new int[count];
        int pointer = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                factors[pointer] = i;
                pointer++;
                if (i != num / i && num != num / i) {
                    factors[pointer] = num / i;
                    pointer++;
                }
            }
        }
        return factors;
    }

    /*
    Method: check if the sum of all factors is equal to the number itself -> if so, perfect number
     */
    public boolean isPerfect() {
        int sum = getSum()[0];
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Method: check if the sum of all factors is larger than the number itself -> if so, abundant number
     */
    public boolean isAbundant() {
        int sum = getSum()[0];
        System.out.println(sum);
        if (sum > num) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNarcissistic() {
        return false;
    }

}


