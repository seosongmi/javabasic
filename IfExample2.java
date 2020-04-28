
public class IfExample2 {
    public static void main(String[] args) {

        int score = 100;
        if (score >= 90) {
            System.out.println("점수가 90점이상입니다.");
            if (score >= 95) {
                System.out.println("a+입니다");
            } else {
                System.out.println("a입니다");
            }
        } else if (score >= 80) {
            System.out.println("점수가 80점이상입니다");
        } else if (score >= 70) {
            System.out.println("점수가 90점이상입니다.");
        } else if (score >= 60) {
            System.out.println("번호 4번이 나왔습니다.");     
        } else {
            System.out.println("번호 6번이 나왔습니다.");
        }
    }
}