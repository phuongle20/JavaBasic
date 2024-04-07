package day5;

import java.util.Scanner;

import org.openqa.selenium.By;

public class DecisionMaking {
public void tinhTong() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Input an integer between 0 and 1000");
	int n = scan.nextInt();
	int tong = 0;
			if(n<10 ) {
				tong = n;
			}
			else if (n>= 10 && n<100) {
				int hangChuc = n/10;
				int hangDonVi = n%10;
				tong = hangChuc + hangDonVi;
				
			}
			else if (n>=100 && n<1000) {
				int hangTram = n/100;
				int hangChuc = (n%100)/10;
				int hangDonVi = n%10;
				tong = hangTram + hangChuc + hangDonVi;
				
			}
			System.out.println("The sum of all digits in " + n + " is " + tong);
			
}
 
public void printDayofWeek(int n) {
	switch (n) {
	case 2 :{
		System.out.println("Thứ " + n );
		break;
	}
	case 3 :{
		System.out.println("Thứ " + n );
		break;
	}
	case 4 :{
		System.out.println("Thứ " + n );
		break;
	}
	case 5 :{
		System.out.println("Thứ " + n );
		break;
	}
	case 6 :{
		System.out.println("Thứ " + n );
		break;
	}
	case 7 :{
		System.out.println("Thứ " + n );
		break;
	}
	case 8 :{
		System.out.println("Thứ " + n );
		break;
	}
	default :{
		System.out.println(" Nhập lại n " );
		break;
	}
	
	}
}

public By getLocator(String locatorType, String locatorValue) {
	By result = null;
	switch(locatorType) {
	case "id":
	{result = By.id(locatorValue);
	break;}
	case "name":
	{result = By.name(locatorValue);
	break;}
	case "linkText":
	{result = By.linkText(locatorValue);
	break;}
	case "cssSelector":
	{result = By.cssSelector(locatorValue);
	break;}
	case "partialLinkText":
	{result = By.partialLinkText(locatorValue);
	break;}
	case "tagName":
	{result = By.tagName(locatorValue);
	break;}
	case "xpath":
	{result = By.xpath(locatorValue);
	break;}
	default :{
		System.out.println("locator type is invalid ");
		break;
	} 
	
	}
	return result;
}

}
