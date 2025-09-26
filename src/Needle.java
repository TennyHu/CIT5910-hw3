import java.util.*;

public class Needle {

    private Random generator;

    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops) {
        // implement
        int hits = 0;
        for (int i = 0; i < totalDrops; i++) {
            double alpha = generator.nextDouble() * 180;
            double y_low = generator.nextDouble() * 2;
            double y_high = y_low + Math.sin(alpha);
            if (y_high >= 2) {
                hits++;
            }
        }
        return totalDrops / hits;
    }
}

