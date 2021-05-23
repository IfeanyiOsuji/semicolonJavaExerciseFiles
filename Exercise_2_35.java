import java.util.Scanner;
public class Exercise_2_35{
public static void main(String [] args){
    System.out.println("Car pooling savings calculator\n");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter total miles driven per day ");
    double totalMilesDrivenPerDay = input.nextDouble();
    System.out.println("input cost per gallon of gasolline ");
    double costPerGallonOfGasoline = input.nextDouble();
    System.out.println("How many gallons per day? ");
    int numberOfGallonsPerDay = input.nextInt();
    double averageMilesPerGallon = totalMilesDrivenPerDay / numberOfGallonsPerDay;
    
    System.out.println("How much is your parking fees per day? ");
    int parkingFeesPerDay = input.nextInt();
    System.out.println("How much do you pay for tolls in a day? ");
    int tollsPerDay = input.nextInt();
    
    double costPerDay = averageMilesPerGallon * costPerGallonOfGasoline + parkingFeesPerDay + tollsPerDay;
    System.out.println("Cost per day = " + costPerDay);

}

}
