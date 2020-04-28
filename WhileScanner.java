import java.util.*;

public class WhileScanner {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("값[정수]을 입력하세요.");
            int inputvalue = scn.nextInt();
            if (inputValue > 0) {
                sum = sum + inputvalue;
                System.out.println("현재까지 합:" + sum);
            } else {
                break;
            }
        }
        System.out.println("sum:" + sum);
        scn.close();
    }
}