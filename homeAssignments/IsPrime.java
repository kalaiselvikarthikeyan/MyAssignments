package homeAssignments;

public class IsPrime {

	public static void main(String[] args) {
		int inputNum=13, count=0;
		for (int i = 1; i <=inputNum; i++) {
			if(inputNum%i==0)
			{
				count++;
			}		
		}
if(count==2)
	System.out.println(inputNum+" is a Prime Number");
else
	System.out.println(inputNum+" is not a Prime Number");
	}

}
