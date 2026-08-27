import java.util.Scanner;

public class trafficviolation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Traffic Violation Analyser");

        System.out.print("Enter vehicle number: ");
        String vehicleNumber = scanner.nextLine().trim();

        if (vehicleNumber.length() != 10) {
            System.out.println("Invalid vehicle number");
            scanner.close();
            return;
        } else {
            System.out.println("Valid vehicle number");
        }

        System.out.print("Enter vehicle type (2/3/4 wheeler): ");
        int vehicleType = scanner.nextInt();
        scanner.nextLine();

        if (vehicleType != 2 && vehicleType != 3 && vehicleType != 4) {
            System.out.println("Invalid vehicle type");
            scanner.close();
            return;
        }

        System.out.print("Enter vehicle speed in km/h: ");
        double speed = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter driver age: ");
        int driverAge = scanner.nextInt();
        scanner.nextLine();

        boolean helmetUsed = true;

        if (vehicleType == 2) {

            System.out.print(
                "Is the driver wearing a helmet? (yes/no): "
            );

            String helmetAnswer =
                scanner.nextLine().trim().toLowerCase();

            if (helmetAnswer.equals("yes") ||
                helmetAnswer.equals("y")) {

                helmetUsed = true;

            } else if (helmetAnswer.equals("no") ||
                       helmetAnswer.equals("n")) {

                helmetUsed = false;

            } else {

                System.out.println("Invalid answer for helmet.");
                scanner.close();
                return;
            }
        }

        boolean seatBeltUsed = true;

        if (vehicleType == 4) {

            System.out.print(
                "Is the driver wearing a seat belt? (yes/no): "
            );

            String seatBeltAnswer =
                scanner.nextLine().trim().toLowerCase();

            if (seatBeltAnswer.equals("yes") ||
                seatBeltAnswer.equals("y")) {

                seatBeltUsed = true;

            } else if (seatBeltAnswer.equals("no") ||
                       seatBeltAnswer.equals("n")) {

                seatBeltUsed = false;

            } else {

                System.out.println("Invalid answer for seat belt.");
                scanner.close();
                return;
            }
        }

        System.out.print(
            "Is this an emergency vehicle? (yes/no): "
        );

        String emergencyAnswer =
            scanner.nextLine().trim().toLowerCase();

        boolean emergencyVehicle;

        if (emergencyAnswer.equals("yes") ||
            emergencyAnswer.equals("y")) {

            emergencyVehicle = true;

        } else if (emergencyAnswer.equals("no") ||
                   emergencyAnswer.equals("n")) {

            emergencyVehicle = false;

        } else {

            System.out.println("Invalid answer for emergency vehicle.");
            scanner.close();
            return;
        }

        int totalFine = 0;
        boolean violationFound = false;

        System.out.println("\n----- Final Validation -----");

        System.out.println("Vehicle number: " + vehicleNumber);

        if (vehicleType == 2) {
            System.out.println("Vehicle type: 2 Wheeler");
        } else if (vehicleType == 3) {
            System.out.println("Vehicle type: 3 Wheeler");
        } else {
            System.out.println("Vehicle type: 4 Wheeler");
        }

        System.out.printf(
            "Recorded speed: %.1f km/h%n",
            speed
        );

        System.out.println(
            "Emergency vehicle: " +
            (emergencyVehicle ? "Yes" : "No")
        );

        System.out.println("\nViolations:");

        if (driverAge < 18) {

            System.out.println(
                "- Driver is under 18 years old - Fine: Rs. 2000"
            );

            totalFine = totalFine + 2000;
            violationFound = true;
        }

        if (speed > 60 && !emergencyVehicle) {

            System.out.println(
                "- Speeding above 60 km/h - Fine: Rs. 1000"
            );

            totalFine = totalFine + 1000;
            violationFound = true;
        }

        if (vehicleType == 2 && !helmetUsed) {

            System.out.println(
                "- Helmet not worn - Fine: Rs. 500"
            );

            totalFine = totalFine + 500;
            violationFound = true;
        }

        if (vehicleType == 4 && !seatBeltUsed) {

            System.out.println(
                "- Seat belt not worn - Fine: Rs. 500"
            );

            totalFine = totalFine + 500;
            violationFound = true;
        }

        System.out.println();

        if (!violationFound) {

            System.out.println(
                "Status: No traffic violation detected."
            );

            System.out.println("Applicable fine: Rs. 0");

        } else {

            System.out.println(
                "Status: Traffic violation detected."
            );

            System.out.println(
                "Total Applicable Fine: Rs. " + totalFine
            );
        }

        scanner.close();
    }
}