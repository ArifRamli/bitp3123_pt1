

public class MarsWeightCalculator {
    private double earthWeight;
    private final double MARS_GRAVITY = 0.38;
    
    public MarsWeightCalculator(double earthWeight) {
        this.earthWeight = earthWeight;
    }
    
    public double calculateMarsWeight() {
        return earthWeight * MARS_GRAVITY;
    }
}

