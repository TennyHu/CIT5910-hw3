import java.util.Random;

public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    /*
    Method: getter for numberOfPeople
     */
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    /*
    Method: return the number of people who has their own coats back
     */
    public int numPplWhoGotTheirCoat(int[] permutation) {
        int res = 0;
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] - 1 == i) {
                res++;
            }
        }
        return res;
    }

    /*
    Method: simulate the coat experiment
    input - the number of trials run
    return - an int array including the number of ppl get their own coats back, given the number of trials run
     */
    public int[] simulateCoatExperiment(int iterations) {
        int[] res = new int[iterations];
        RandomOrderGenerator randomOrderGenerator = new RandomOrderGenerator();
        for (int i = 0; i < iterations; i++) {
            int[] permutation = randomOrderGenerator.getRandomOrder(numberOfPeople);
            int rightCoat = numPplWhoGotTheirCoat(permutation);
            res[i] = rightCoat;
        }
        return res;
    }

    /*
    Method: given the results array, compute the probability that 0 people get their coats back
     */
    public double answerToQuestionOne(int[] results) {
        int zeroCount = 0;
        double res = 0.0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 0) {
                zeroCount++;
            }
        }
        return zeroCount / (double) results.length;
    }

    /*
    Method: given the results array, compute the average number of coats returned per trial
     */
    public double answerToQuestionTwo(int[] results) {
        double sum = 0.0;
        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }
        return sum / (double) results.length;
    }

}


