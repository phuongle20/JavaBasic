package day3;

import java.util.Scanner;

public class DataTypesAndVariables {
	public static void printString() {
		System.out.println("Hello World");
		
	}
	public void printMultiStrings() {
		System.out.print("++++++\n\r");
		
		System.out.print("@@@@@@\r");
		
		System.out.print("******\n\r");
		
		System.out.print("######");
		
	}
	public void displayVariables() {
		byte a = 10;
		float b = 20.3f;
		float c = 3.14785f;
		System.out.println("a= "+a );
		System.out.println("b= "+b );
		System.out.println("c= "+c );
	}
	public void displayBoolean() {
		boolean a = true;
		a = false;
		System.out.println(a);
		
	} 
	
	public void convertFtoC() {
//		int f=212;
		Scanner scan = new Scanner (System.in);
		System.out.println("Input a degree: ");
		int f = scan.nextInt();
		System.out.println("Input a degree in Fahrenheit:" +f);
		float c = (float)((f-32)/1.8);
		System.out.println(f+" degree Fahrenheit is equal to "+c+" in Celsius");
	}
	public void convertInchestoMeter() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Input a value for inch: ");
		int inch = scan.nextInt();
	 float meter = inch*0.0254f;
	 System.out.println(inch +" inch is "+meter + "meters");
		
	}
	
	
	
	
	

}
