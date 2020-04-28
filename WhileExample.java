
public class WhileExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        // while사용.
        int i = 1;
        while (i <= 5) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum1:" + sum);

        // while...
        while (true) {
            if (i > 5) {
                break;
            }
            sum = sum + i;
            i++;
        }
        
        System.out.println("sum2:" + sum);
    }

}