package week1.day1;

public class DataCasting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1 = 1111;
		float num2 = 10.55f;
		double num3 = 786.77d;
		
		long integertolong = num1;
		System.out.println("Converted Interger to Long Value is - " + integertolong);
		
		double integertodouble = num1;
		System.out.println("Converted Interger to Double Value is - " + integertodouble);
		
		int floattoint = (int) num2;
		System.out.println("Converted float to integer value is - " + floattoint);
		
		double floattodouble = num2;
		System.out.println("Converted float to double value is - " + floattodouble);
		
		int doubletoint = (int) num3;
		System.out.println("Converted double to int value is - " + doubletoint);
		
		float doubletofloat = (float) num3;
		System.out.println("Converted double to float value is - " + doubletofloat);

	}

}
