import java.util.Scanner;

public class P05SnowFlake {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int pictureLength = 2 * n + 3;

        //top half:
        int halfHeight = n;
        for (int i = 0; i < halfHeight; i++) {
            System.out.print(returnStr(i, '.'));
            System.out.print('*');
            if (i != halfHeight - 1) {
                System.out.print(returnStr(n - i, '.'));
            } else {
                System.out.print('*');
            }
            System.out.print('*');
            if (i != halfHeight - 1) {
                System.out.print(returnStr(n - i, '.'));
            } else {
                System.out.print('*');
            }
            System.out.print('*');
            System.out.println(returnStr(i, '.'));
        }
        //middle part:
        System.out.println(returnStr(pictureLength, '*'));
        //lower half:
        for (int i = 1; i <= halfHeight; i++) {
            System.out.print(returnStr(n - i, '.'));
            System.out.print('*');
            if (i != 1) {
                System.out.print(returnStr(i, '.'));
            } else {
                System.out.print('*');
            }
            System.out.print('*');
            if (i != 1) {
                System.out.print(returnStr(i, '.'));
            } else {
                System.out.print('*');
            }
            System.out.print('*');
            System.out.println(returnStr(n - i, '.'));
        }

        //main ends here
    }

    static String returnStr(int count, char character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

}