package week1.day1;

public class FindOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd numbers are -");
		for (int num = 1 ; num <= 10; num++)
		{
			if (num%2 == 1)
			{
				System.out.println(" " +num);
			}
			else
			{
				continue;
			}
		}
	}

}
