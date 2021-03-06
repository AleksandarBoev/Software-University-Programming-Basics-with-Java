import java.util.Scanner;
public class P02Lutenica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountTomato = Double.parseDouble(scanner.nextLine());
        int countBoxes = Integer.parseInt(scanner.nextLine());
        int countJars = Integer.parseInt(scanner.nextLine());
        double lutenica = 5;
        double jarsVolume = 0.535;

        double lutenicaTotal = amountTomato/ lutenica;
        System.out.printf("Total lutenica: %.0f kilograms.%n",Math.floor(lutenicaTotal));

        double jars = lutenicaTotal / jarsVolume;

        double jarsLeft = Math.floor( jars - (countBoxes *countJars));

        double boxes = jars / countJars;
        if (boxes > countBoxes) {
            double boxesLeft = Math.floor(boxes - countBoxes);
            System.out.printf("%.0f boxes left.%n", boxesLeft);
            System.out.printf("%.0f jars left.", jarsLeft);
        } else if (boxes <= countBoxes) {
            double boxesNeeded = Math.floor(countBoxes -boxes);
            double jarsNeeded = Math.floor((countBoxes * countJars) -jars);
            System.out.printf("%.0f more boxes needed.%n",boxesNeeded);
            System.out.printf("%.0f more jars needed.%n",jarsNeeded);
        }

    }
}