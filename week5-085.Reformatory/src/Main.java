
public class Main {

    public static void main(String[] args) {
        // write here test code 
        Reformatory raipur = new Reformatory();
        
        Person yogesh = new Person("Yogesh",24,184,82);
        Person appa = new Person("Appa",24,186,85);
        
        System.out.println("totl weights measured: " + raipur.totalWeightsMeasured());
        System.out.println(yogesh.getName() + " weight: " + raipur.weight(yogesh) + " kilos");
        System.out.println(appa.getName() + " Weight: " + raipur.weight(appa) + " kilos");
        
        raipur.feed(appa);
        raipur.feed(appa);
        
        System.out.println("totl weights measured: " + raipur.totalWeightsMeasured());
        System.out.println(yogesh.getName() + " weight: " + raipur.weight(yogesh) + " kilos");
        System.out.println(appa.getName() + " Weight: " + raipur.weight(appa) + " kilos");
        
        System.out.println("totl weights measured: " + raipur.totalWeightsMeasured());
    }
}
