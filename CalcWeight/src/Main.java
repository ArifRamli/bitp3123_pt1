import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> earthWeights = new ArrayList<Double>();
        earthWeights.add(68.0);
        earthWeights.add(80.0);
        earthWeights.add(90.0);
        
        WeightList weightList = new WeightList(earthWeights);
        
        ArrayList<Double> marsWeights = weightList.getMarsWeights();
        
        for (int i = 0; i < earthWeights.size(); i++) {
            System.out.println("Weight on Earth: " + earthWeights.get(i) + " kg");
            System.out.println("Weight on Mars: " + marsWeights.get(i) + " kg");
            System.out.println();
        }
    }
}