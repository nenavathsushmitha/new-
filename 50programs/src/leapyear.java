/*
 * 	import java.util.Scanner;
public class leapyear {
	int year;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a year to find wheather it is leap year or not:");
	year=in.nextInt();
	if(year%4==0)
	{
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(+year"is a leap year");
			}
			else 
			{
				System.out.println(+year"is not a leap year");
			}
		}
		else 
		{
			System.out.println(+year"is a leap year");
		}
	}
	else
	{
		System.out.println(+year"is not a leap year");
	}

}*/
import java.util.Scanner;
public class leapyear {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
   }
}