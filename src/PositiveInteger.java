public class PositiveInteger {

    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    public int getSum() {
        int sum = 0;
        for (int i = 1; i * i < num; i++) {
            if (num % i == 0) { // i is a factor of num
                sum += i;
                //System.out.println(i);
                if (i != num / i && num != num / i) {
                    // if i is a factor, num / i is also a factor
                    sum += num / i;
                    //System.out.println(num/i);
                }
            }
        }
        return sum;
    }

    public boolean isPerfect() {
        int sum = getSum();
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAbundant() {
        int sum = getSum();
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


