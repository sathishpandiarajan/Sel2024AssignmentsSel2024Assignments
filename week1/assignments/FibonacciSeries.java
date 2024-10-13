package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8, num1 = 0, num2 = 1, temp;
		
		System.out.println("Fibonacci Series for the range " +range+ " is - ");
		
		for(int i = 1; i <= range; i++)
		{
			System.out.print(num1 + "  ");
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
		}
	}
}
