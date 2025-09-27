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

    public double answerToQuestionOne(int[] results) {
        return 0.0;
    }

    public double answerToQuestionTwo(int[] results) {
        return 0.0;
    }


    public static void main(String[] args) {

    }
}


