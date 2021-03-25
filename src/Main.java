import java.util.HashMap;
import java.util.Scanner;

/**
 * Author:Viper
 * Data:2021/3/18
 * description:
 */
public class Main {
    public static HashMap<Character, Integer> xm = new HashMap<>();
    public static HashMap<Character, Integer> xw = new HashMap<>();
    public static HashMap<Character, Integer> xl = new HashMap<>();
    public static void addnum(String m,int c){
        if(c==3) {
            for (int i = 0; i < m.length(); i++) {
                xm.put(m.charAt(i), xm.getOrDefault(m.charAt(i), 0) + 1);
            }
        }
        if(c==2) {
            for (int i = 0; i < m.length(); i++) {
                xw.put(m.charAt(i), xw.getOrDefault(m.charAt(i), 0) + 1);
            }
        }
        if(c==1) {
            for (int i = 0; i < m.length(); i++) {
                xl.put(m.charAt(i), xl.getOrDefault(m.charAt(i), 0) + 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int k = in.nextInt();
        int c=3;
        while (in.hasNext()&& c>0 ) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String m = in.nextLine();
            addnum(m,c);
            c--;
        }
        System.out.println(xm.keySet());
    }
}
