package homeAssignments;

public class FibonacciSeriesTest {

	public static void main(String[] args) {
		int range=8, firstNum=0, secondNum=1, result=0;
		for (int i = 0; i < range; i++) {
			System.out.println(firstNum);
			result=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=result;
		}
	}

}
