public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i * i < num; i++) {
            if (num % i == 0) { // i is a factor of num
                sum += i;
                System.out.println(i);
                if (i != num / i && num != num / i) {
                    // if i is a factor, num / i is also a factor
                    sum += num / i;
                    System.out.println(num/i);
                }
            }
        }
        System.out.println("The sum of the factors is: " + sum);
        if (sum == num) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isAbundant() {
        return false;
    }

    public boolean isNarcissistic() {
        return false;
    }

}


