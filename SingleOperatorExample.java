
public class SingleOperatorExample {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		num2 = -num1;
		num1++; // num1= num1 + 1;
		num2 = 10 + 20;
		
		for (int i=0; i<5; i++) {
			num1++;
		}
		System.out.println("num : " + num1);
		
		for (int i=0; i<5; i++) {
			num1--;
		}
		System.out.println("num : " + num1);
		
		num2 = -num2; // -30
		num2 = -num2; // 30
		for (int i=0; i<3; i++) {
			num2 = -num2;
		}
		System.out.println("final num2 : " + num2);
		
		boolean isTrue = false;
		isTrue = !isTrue; //true
		if (isTrue) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		int bit1 = 10;
		int bit2 = ~bit1 + 1;
		System.out.println(bit2);
	}
}