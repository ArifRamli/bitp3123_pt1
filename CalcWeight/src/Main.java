
public class Main {
    public static void main(String[] args) {
        double earthWeight = 68.0; // weight in kg
        MarsWeightCalculator calculator = new MarsWeightCalculator(earthWeight);
        double marsWeight = calculator.calculateMarsWeight();
        
        System.out.println("Weight on Earth: " + earthWeight + " kg");
        System.out.println("Weight on Mars: " + marsWeight + " kg");
    }
}
