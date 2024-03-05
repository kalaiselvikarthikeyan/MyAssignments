package homeAssignments;

public class PalindromeNumber {

	public static void main(String[] args) {
		int inputNum=1234321, reverseNum=0, rem=0;
		int orgNum=inputNum;
		System.out.println("The given Number is :"+inputNum);
		while(inputNum!=0)
		{
			rem=inputNum%10;
			reverseNum=reverseNum*10+rem;
			inputNum=inputNum/10;	
			
		}		
		if(orgNum==reverseNum)
				System.out.println("Given Number is a Palindrome");
		else
			System.out.println("Given Number is not a Palindrome");		
	}

}
