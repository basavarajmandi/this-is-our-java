package polymorphism;

public class Person {
	

	public static void buy(String mobile,int money)
	{
		System.out.println("String mobile:"+mobile +"  "+"int money:"+money);
	}
	public static void buy(String food, float quantity)
	{
	   	System.out.println("String food:"+food +"  "+"float quantity:"+quantity);
	}
	public static void buy(String dress, int shoes, String belt)
	{
		System.out.println("String dress:"+dress +"  "+ "int shoes:"+shoes +"  "+  "Stirng belt:"+belt);
	}
	public static void buy(String bag, double watchPrice)
	{
		System.out.println("String bag:"+bag +"   "+  "double watchPrice:"+watchPrice);
	}
	

}
