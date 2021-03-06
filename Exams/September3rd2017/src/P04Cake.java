import java.util.Scanner;

public class P04Cake {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(console.nextLine());
        int cakeLength = Integer.parseInt(console.nextLine());
        String piecesOrStop = console.nextLine();

        int totalPieces = cakeLength * cakeWidth; //parche torta e s razmeri = 1x1 => plosht = parcheta torta
        boolean enoughPieces = true;

        while (!piecesOrStop.equals("STOP")) {
            int pieces = Integer.parseInt(piecesOrStop);
            if (pieces > totalPieces) {
                enoughPieces = false;
                totalPieces -= pieces;
                break;
            } else {
                totalPieces -= pieces;
            }
            piecesOrStop = console.nextLine();
        }

        if (!enoughPieces) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        } else {
            System.out.printf("%d pieces are left.", totalPieces);
        }

        //main ends here
    }
}