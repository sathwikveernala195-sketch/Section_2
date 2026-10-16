import java.util.Scanner;

class SolarEnergyCalculator {

    // Method to calculate total energy generated
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read morning energy generation value from the user
        System.out.print("Enter morning energy generation (kWh): ");
        double morningEnergy = scanner.nextDouble();

        // Read evening energy generation value from the user
        System.out.print("Enter evening energy generation (kWh): ");
        double eveningEnergy = scanner.nextDouble();

        // Call the method and store the result
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        // Display the total energy generated
        System.out.println("Total energy generated: " + totalEnergy + " kWh");

        scanner.close();
    }
}
