import java.util.Scanner;

public class P01StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char k = 'a'; k < 'a' + l; k++) {
                    for (char m = 'a'; m < 'a' + l; m++) {
                        for (int o = 1; o <= n ; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%s%s%s%s%s ", i, j, k, m, o);
                            }
                        }
                    }
                }
            }
        }
        //main ends here
    }
}
