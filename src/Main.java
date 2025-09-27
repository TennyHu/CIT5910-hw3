public class Main {
    public static void main(String[] args) {
//        PositiveInteger pi = new PositiveInteger(36);
//        Needle nd = new Needle();
//        System.out.println(nd.runExperiment(594));

        CoatExperimentSimulator c = new CoatExperimentSimulator(20);
        int numberOfPeople = c.getNumberOfPeople();

//        int[] trials = RandomOrderGenerator.getRandomOrder(numberOfPeople);
//        for (int i = 0; i < trials.length; i++) {
//            System.out.println("This is number " + i + " getting coat Number: " + trials[i] + " ");
//        }
//        int experiment = c.numPplWhoGotTheirCoat(trials);
//        System.out.println("The right ppl are: " + experiment);
        int[] result = c.simulateCoatExperiment(numberOfPeople);
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("This is trial no. " + i + " with this number of people having right coat: " + result[i]);
        }
        System.out.println("The probability of 0 people getting back: " + c.answerToQuestionOne(result));
    }
}
