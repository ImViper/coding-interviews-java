import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:Viper
 * Data:2021/3/18
 * description:
 */
public class shengzheweiwang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int[] cnt = new int[256];
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < a.length(); i++) {
            x = Math.max(x, ++cnt[a.charAt(i)]);
        }
        Arrays.fill(cnt, 0);
        for (int i = 0; i < a.length(); i++) {
            y = Math.max(y, ++cnt[b.charAt(i)]);
        }
        Arrays.fill(cnt, 0);
        for (int i = 0; i < a.length(); i++) {
            z = Math.max(z, ++cnt[c.charAt(i)]);
        }

        int len = a.length();
        x = Math.min(x + n, len);
        y = Math.min(y + n, len);
        z = Math.min(z + n, len);
        if (x > y && x > z) System.out.println("xiaoming");
        else if (y > x && y > z) System.out.println("xiaowang");
        else if (z > x && z > y) System.out.println("xiaoli");
        else System.out.println("draw");
    }
}
