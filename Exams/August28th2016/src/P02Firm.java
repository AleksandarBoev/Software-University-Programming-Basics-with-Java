import java.util.Scanner;

public class P02Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int tryhardWorkers = Integer.parseInt(scanner.nextLine());

        double workHours = (days - (days * 0.1)) * 8;
        int moreHours = tryhardWorkers * 2 * days;

        double allHours = Math.floor(workHours + moreHours);
        double hoursLeft = hours - allHours;

        if (allHours < hours) {
            System.out.printf("Not enough time!%d hours needed.", Math.abs(Math.round(hoursLeft)));
        } else {
            System.out.printf("Yes!%d hours left.", Math.abs(Math.round(hoursLeft)));
        }


        //code ends here


    }
}
