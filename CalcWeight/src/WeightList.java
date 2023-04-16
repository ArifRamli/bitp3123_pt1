
import java.util.ArrayList;

public class WeightList {
    private ArrayList<Double> earthWeights;
    private ArrayList<Double> marsWeights;
    
    public WeightList(ArrayList<Double> earthWeights) {
        this.earthWeights = earthWeights;
        this.marsWeights = new ArrayList<Double>();
        
        for (Double earthWeight : earthWeights) {
            MarsWeightCalculator calculator = new MarsWeightCalculator(earthWeight);
            double marsWeight = calculator.calculateMarsWeight();
            marsWeights.add(marsWeight);
        }
    }
    
    public ArrayList<Double> getEarthWeights() {
        return earthWeights;
    }
    
    public ArrayList<Double> getMarsWeights() {
        return marsWeights;
    }
}