import java.util.Scanner;

public class GroupName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char character1 = console.nextLine().charAt(0);
        char character2 = console.nextLine().charAt(0);
        char character3 = console.nextLine().charAt(0);
        char character4 = console.nextLine().charAt(0);
        int number = Integer.parseInt(console.nextLine());

        int count = -1;

        for (int c1 = 'A'; c1 <= character1; c1++) {
            for (int c2 = 'a'; c2 <= character2; c2++) {
                for (int c3 = 'a'; c3 <= character3; c3++) {
                    for (int c4 = 'a'; c4 <= character4; c4++) {
                        for (int n = 0; n <= number; n++) {
//                            System.out.print("" + c1 + c2 + c3 + c4 + n + " ");
                            count ++;
                        }
                    }
                }
            }
        }
        System.out.print(count);

        //main ends here
    }
}
