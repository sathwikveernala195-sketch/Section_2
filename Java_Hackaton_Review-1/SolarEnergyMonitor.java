import java.util.Scanner;

class SolarEnergyMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter energy generated (in kWh): ");
        double energy = scanner.nextDouble();

        if (energy >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        scanner.close();
    }
}
